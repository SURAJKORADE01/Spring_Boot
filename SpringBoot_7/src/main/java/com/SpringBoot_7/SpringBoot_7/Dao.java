package com.SpringBoot_7.SpringBoot_7;

import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;


// Database related code
@Repository
public class Dao
{
    public ArrayList<IplTeams> getIplTeams() throws ClassNotFoundException, SQLException
    {
        ArrayList<IplTeams> addIplTeam = new ArrayList<IplTeams>();

        try {
            Connection cobj = DbConnection.DbConnect();

            Statement sobj = cobj.createStatement();

            ResultSet robj = sobj.executeQuery("select * from iplteams");

            while (robj.next()) {
                String teamName = robj.getString("teamName");
                int iplTrophies = robj.getInt("trophics");
                String teamOwnerName = robj.getString("teamOwnerName");
                String teamCaptainName = robj.getString("teamCaptainName");

                IplTeams iplTeams = new IplTeams(teamName, iplTrophies, teamOwnerName, teamCaptainName);

                addIplTeam.add(iplTeams);
            }
        }

        catch(Exception eobj)
        {
            System.out.println("Unable to connect with the database");
        }

        return addIplTeam;
    }

    public String insertIplTeam(IplTeams iplTeams) throws SQLException, ClassNotFoundException
    {
        Connection cobj = DbConnection.DbConnect();

        PreparedStatement pobj = cobj.prepareStatement("insert into iplTeams values (?,?,?,?)");

        pobj.setString(1,iplTeams.getTeamName());
        pobj.setInt(2,iplTeams.getTrophies());
        pobj.setString(3,iplTeams.getTeamOwnerName());
        pobj.setString(3, iplTeams.getTeamCaptainName());

        pobj.executeUpdate();

        return "Data gets inserted successfully";
    }
}

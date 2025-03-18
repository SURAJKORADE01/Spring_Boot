package com.SpringBoot_7.SpringBoot_7;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Business Logic
@org.springframework.stereotype.Service
public class Service
{
    @Autowired // Spring boot create the object
    Dao dao;

    public List<IplTeams> getIplTeams() throws SQLException, ClassNotFoundException
    {
        List<IplTeams> list =  dao.getIplTeams();
        return list;

//        List<IplTeams> iplTeams = dao.getIplTeams();
//
//        ArrayList<IplTeams> filterList = new ArrayList<IplTeams>();
//
//        for(IplTeams ipl : iplTeams)
//        {
//            if(ipl.teamName.equals("MI"))
//            {
//                filterList.add(ipl);
//            }
//        }
//
//        return filterList;
    }

    public String pushIplTeam(IplTeams iplTeams) throws SQLException, ClassNotFoundException
    {
        String str = dao.insertIplTeam(iplTeams);
        return str;
    }
}

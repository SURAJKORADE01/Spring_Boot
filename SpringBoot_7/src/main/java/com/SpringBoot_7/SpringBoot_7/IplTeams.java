package com.SpringBoot_7.SpringBoot_7;

public class IplTeams
{
    String teamName;
    int trophies;
    String teamOwnerName;
    String teamCaptainName;

    public IplTeams()
    {

    }

    public IplTeams(String teamName, int trophies, String teamOwnerName, String teamCaptainName) {
        this.teamName = teamName;
        this.trophies = trophies;
        this.teamOwnerName = teamOwnerName;
        this.teamCaptainName = teamCaptainName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public String getTeamOwnerName() {
        return teamOwnerName;
    }

    public void setTeamOwnerName(String teamOwnerName) {
        this.teamOwnerName = teamOwnerName;
    }

    public String getTeamCaptainName() {
        return teamCaptainName;
    }

    public void setTeamCaptainName(String teamCaptainName) {
        this.teamCaptainName = teamCaptainName;
    }

    @Override
    public String toString() {
        return "IplTeam{" +
                "teamName='" + teamName + '\'' +
                ", trophies=" + trophies +
                ", teamOwnerName='" + teamOwnerName + '\'' +
                ", teamCaptainName='" + teamCaptainName + '\'' +
                '}';
    }
}
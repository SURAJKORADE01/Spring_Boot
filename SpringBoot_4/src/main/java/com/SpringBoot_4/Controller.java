package com.SpringBoot_4;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller
{
    @GetMapping("/hello")
    public String homeMethod()
    {
        return "Hello everyone...";
    }

    @GetMapping("/ipl")
    public String[] iplTeams()
    {
        String[] Arr = {"Mumbai", "CSK", "RCB", "PAN", "KKR", "HYD", "DC", "RR"};
        return Arr;
    }

    @GetMapping("ipl/count")
    public int countTeam()
    {
        return 10;
    }

    @GetMapping("/info/{teamName}/{captainName}")
    public ArrayList<IplTeam> teamData(@PathVariable String teamName, @PathVariable String captainName)
    {
        System.out.println(teamName);
        ArrayList<IplTeam> list = new ArrayList<IplTeam>();

        if(teamName.equals("mi") && (captainName.equals("rohit sharma")))
        {
            list.add(new IplTeam("MI",5,"Ambani","Rohit Sharma"));
        }

        else if(teamName.equals("csk"))
        {
            list.add(new IplTeam("CSK",5,"ABC","Dhoni"));
        }

        else if(teamName.equals("rcb"))
        {
            list.add(new IplTeam("RCB",0,"SRK","Virat Kohli"));
        }

        else if(teamName.equals(("kkr")))
        {
            list.add(new IplTeam("KKR",3,"XYZ","Shreyas"));
        }

        else if(teamName.equals("kxip"))
        {
            list.add(new IplTeam("KXIP", 2, "Priti", "Sam Curron"));
        }

        return list;
    }
}

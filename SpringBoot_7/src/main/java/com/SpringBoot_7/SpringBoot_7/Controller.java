package com.SpringBoot_7.SpringBoot_7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

// Handle the request
@RestController
public class Controller
{
    @Autowired
    Service service;

    @GetMapping("/iplTeams")
    public List<IplTeams> iplTeams() throws SQLException, ClassNotFoundException
    {
        List<IplTeams> iplTeams =  service.getIplTeams();
        return iplTeams;
    }

//   @RequestBody -> used to accept the JSON data
    @PostMapping("/iplTeams")
    public String insertIplTeam(@RequestBody IplTeams iplTeams) throws SQLException, ClassNotFoundException
    {
        String msg = service.pushIplTeam(iplTeams);
        return msg;
    }
}

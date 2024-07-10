package com.example.udemycourse1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach name : " + coachName + "\n" + "Team Name : " + teamName;
    }



    @GetMapping("/")
    public String sayHi() {
        return "Hi!";
    }

    @GetMapping("/workout")
    public String workoutFunc() {
        return "This is workout function!";
    }
}

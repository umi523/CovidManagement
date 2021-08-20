package com.example.covidmanagement.Victim;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/victim")
public class VictimController {

    private final VictimService victimService;

    @Autowired
    public VictimController(VictimService victimService) {
        this.victimService = victimService;
    }

    @GetMapping
    public List<Victim> GetVictims() {
        return victimService.GetVictims();
    }

}
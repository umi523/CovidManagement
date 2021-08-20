package com.example.covidmanagement.Victim;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VictimService {

    public List<Victim> GetVictims(){
        return List.of(
                new Victim(
                        "Umair",
                        23,
                        "25963-dw",
                        "Pakistan",
                        "Sindh",
                        "Hyderabad",
                        "Asia",
                        "Male",
                        "Normal",
                        "Currently in severe condition",
                        null,
                        null,
                        false,
                        false
                )
        );
    }

}

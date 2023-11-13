package com.CSCProject.TicketAPI.controller;


import com.CSCProject.TicketAPI.apiService.FlightService;
import com.CSCProject.TicketAPI.flightmodel.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired(required = false)
    private FlightService flightService;

    @GetMapping("/all")
    public List<Flight> getFlights() {
     return flightService.getFlights();
    };


}

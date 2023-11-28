package com.CSCProject.TicketAPI.controller;


import com.CSCProject.TicketAPI.apiService.FlightService;
import com.CSCProject.TicketAPI.flightmodel.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/all")
    public List<Flight> getFlights() {
     return flightService.getFlights();
    };

    @PostMapping("/addFlight")
    public void insert(@RequestBody Flight flight) {
        flightService.addFlight(flight);
    }


    @GetMapping("/destination")
    @ResponseBody
    public List<Flight> getByDestination(@RequestParam String location) throws UnsupportedEncodingException {
        URLEncoder.encode(location, "UTF-8");
        return flightService.findDestination(location);
    }

    @GetMapping("/trips")
    @ResponseBody
    public List<Flight> searchTrip(@RequestParam String from, @RequestParam String to) throws UnsupportedEncodingException {
        URLEncoder.encode(from, "UTF-8");
        URLEncoder.encode(to, "UTF-8");

        return flightService.findTrip(from, to);
    }


}

package com.CSCProject.TicketAPI;

import com.CSCProjectDB.model.Flight;
import com.repository.FlightRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

public class FlightController {
    private final FlightRepo repository;

    public FlightController(FlightRepo repository) {
        this.repository = repository;
    }



    @PostMapping("/flights")
    Flight newFlight(@RequestBody Flight newflight) {

        return repository.save(newflight);
    }







}

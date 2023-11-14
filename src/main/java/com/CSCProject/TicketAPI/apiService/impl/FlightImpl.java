package com.CSCProject.TicketAPI.apiService.impl;

import com.CSCProject.TicketAPI.apiService.FlightService;
import com.CSCProject.TicketAPI.flightmodel.Flight;
import com.CSCProject.TicketAPI.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightImpl implements FlightService {

    @Autowired
    private FlightRepo flights;

    /**
     * @return
     */
    @Override
    public List<Flight> getFlights() {
        return flights.findAll();
    }

    /**
     * @param flight
     * @return
     */
    @Override
    public Flight addFlight(Flight flight) {
        return flights.save(flight);
    }

    /**
     * @param flight
     * @return
     */
    @Override
    public Flight deleteFlight(Flight flight) {

        return null;
    }
}

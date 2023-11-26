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
    @Override //only for testing connection to db + the atlas UI is too messy to use that to add stuff
    public void addFlight(Flight flight) {
         flights.save(flight);
    }

    /**
     * @param flight
     * @return
     */
    @Override
    public Flight deleteFlight(Flight flight) {
        //genuinely dont know why this was giving me errors but we arent using it anyway so whatever i guess
        return null;
    }


    @Override
    public List<Flight> findDestination(String location) {
        return flights.findByLocation(location);
    }

    /**
     * @param flight
     */
    @Override
    public void updateSeat(Flight flight) {

    }


    @Override
    public List<Flight> findTrip(String from, String to) {
        return flights.findTrip(from,  to);
    }


}

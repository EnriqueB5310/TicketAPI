package com.CSCProject.TicketAPI.apiService;

import com.CSCProject.TicketAPI.flightmodel.Flight;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FlightService {
    public List<Flight> getFlights();

    public void addFlight(Flight flight);

    public Flight deleteFlight(Flight flight);

    public List<Flight> findDestination(String location);

    public void updateSeat(Flight flight);

}

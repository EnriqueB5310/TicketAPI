package com.CSCProject.TicketAPI.apiService;

import com.CSCProject.TicketAPI.flightmodel.Flight;

import java.util.List;

public interface FlightService {
    public List<Flight> getFlights();

    public Flight addFlight(Flight flight);

    public Flight deleteFlight(Flight flight);

}

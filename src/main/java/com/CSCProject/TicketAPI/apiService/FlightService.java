package com.CSCProject.TicketAPI.apiService;

import com.CSCProject.TicketAPI.flightmodel.Flight;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public interface FlightService {
    public List<Flight> getFlights();

    public Flight addFlight(Flight flight);

    public Flight deleteFlight(Flight flight);

}

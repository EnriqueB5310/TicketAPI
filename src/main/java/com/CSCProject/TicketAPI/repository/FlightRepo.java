package com.CSCProject.TicketAPI.repository;

import com.CSCProject.TicketAPI.flightmodel.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface FlightRepo extends MongoRepository<Flight, String> {
    @Query("{to:'?0'}")
    Flight findByLocation(String to);





}
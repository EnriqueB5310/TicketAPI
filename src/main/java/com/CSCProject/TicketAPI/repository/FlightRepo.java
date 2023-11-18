package com.CSCProject.TicketAPI.repository;

import com.CSCProject.TicketAPI.flightmodel.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepo extends MongoRepository<Flight, String> {
    @Query("{to:'?0'}")
    List<Flight> findByLocation(String to);





}

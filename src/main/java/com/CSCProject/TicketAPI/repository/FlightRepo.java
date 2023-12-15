package com.CSCProject.TicketAPI.repository;

import com.CSCProject.TicketAPI.flightmodel.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepo extends MongoRepository<Flight, String> {

// find flight by destination
    @Query("{to:'?0'}")
    List<Flight> findByLocation(String to);

    //find by seats availble
    @Query("{seats: '?0'}")
    List<Flight> findBySeats();

    //find trip from its depart and destination spots
    @Query("{'from': ?0, 'to': ?1}")
    List<Flight> findTrip(String from, String to);


}

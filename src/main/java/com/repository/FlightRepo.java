package com.repository;

import com.CSCProjectDB.model.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface FlightRepo extends MongoRepository<Flight, String> {

@Query("{name:'?0}")
    Flight findByLocation(String location);

}

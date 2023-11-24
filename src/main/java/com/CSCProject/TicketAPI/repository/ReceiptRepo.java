package com.CSCProject.TicketAPI.repository;


import com.CSCProject.TicketAPI.recieptModel.FlightReceipt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepo extends MongoRepository<FlightReceipt,String> {

    @Query("{id: '?0'}")
    FlightReceipt findByID(int id);


}

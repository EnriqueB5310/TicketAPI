package com.CSCProject.TicketAPI.repository;


import com.CSCProject.TicketAPI.recieptModel.FlightReceipt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceiptRepo extends MongoRepository<FlightReceipt, Integer> {
    //could add query to find all tickets ever bought under name/email, will do if time.

}

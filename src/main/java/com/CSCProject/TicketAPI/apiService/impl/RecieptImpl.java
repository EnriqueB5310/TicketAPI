package com.CSCProject.TicketAPI.apiService.impl;

import com.CSCProject.TicketAPI.apiService.RecieptService;
import com.CSCProject.TicketAPI.recieptModel.FlightReceipt;
import com.CSCProject.TicketAPI.repository.ReceiptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class RecieptImpl implements RecieptService {


   @Autowired
   private ReceiptRepo reciepts;

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<FlightReceipt> getReciept(int id) {
        return reciepts.findById( id);
    }

    /**
     * @return
     */
    @Override
    public FlightReceipt createReciept(FlightReceipt receipt) {
        return reciepts.save(receipt);
    }



}

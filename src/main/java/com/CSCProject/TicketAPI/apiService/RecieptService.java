package com.CSCProject.TicketAPI.apiService;


import com.CSCProject.TicketAPI.recieptModel.FlightReceipt;
import org.springframework.stereotype.Service;

@Service
public interface RecieptService {

    public FlightReceipt getReciept(int id);

    public FlightReceipt createReciept(FlightReceipt receipt);


}

package com.CSCProject.TicketAPI.apiService;


import com.CSCProject.TicketAPI.recieptModel.FlightReceipt;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RecieptService {

    public Optional<FlightReceipt> getReciept(int id);

    public FlightReceipt createReciept(FlightReceipt receipt);


}

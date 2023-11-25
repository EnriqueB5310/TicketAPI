package com.CSCProject.TicketAPI.controller;

import com.CSCProject.TicketAPI.apiService.FlightService;
import com.CSCProject.TicketAPI.apiService.RecieptService;
import com.CSCProject.TicketAPI.recieptModel.FlightReceipt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reciepts")
public class RecieptController {

    @Autowired
    private RecieptService recieptService;


    @GetMapping("/reciept")
    @ResponseBody
    public FlightReceipt getReciept(@RequestParam int id) {
        return recieptService.getReciept(id);
    }

    //would pass the response body of the flight obj from the front end into the reciept body
    @PostMapping("/create")
    public FlightReceipt createReciept(FlightReceipt receipt) {
        return recieptService.createReciept(receipt);
    }



}

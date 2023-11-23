package com.CSCProject.TicketAPI.recieptModel;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Receipts")
public class FlightReceipt {

    @Id
    private int id;

    private String customerName;

    private int seats;

    private String time;

    private String airport;

    private String destination;


    //Will add constructor,

}

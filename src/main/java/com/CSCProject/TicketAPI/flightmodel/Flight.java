package com.CSCProject.TicketAPI.flightmodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Flights")
public class Flight {

    @Id
    private String id;


    private String from;
    private String to;

    private int time;


    public Flight(String id, String to, String from, int time) {
        super();
        this.id = id;
    }
}

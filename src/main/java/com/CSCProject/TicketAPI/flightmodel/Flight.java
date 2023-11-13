package com.CSCProject.TicketAPI.flightmodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Flights")
public class Flight {

    @Id
    private int id;

    private double price;

    private String airline;


    private String from;
    private String to;

    private String time;


    public int getId() {return this.id; };

    public String getFrom() {
        return from;
    }

    public String getDestination() {
        return to;
    }

    public Flight(int id, String to, String from, String time, int price, String airline) {
        super();
        this.id = id;
    }
}

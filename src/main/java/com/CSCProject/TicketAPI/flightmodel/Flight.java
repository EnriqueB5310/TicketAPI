package com.CSCProject.TicketAPI.flightmodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document("Flights")
public class Flight {

    @Id
    private int id;

    private double price;

    private String airline;

    private int seats;

    private String from;
    private String to;

    private String time;

    public Flight(int id, double price,String airline, int seats, String from, String to, String time) {
        this.id = id;
        this.price = price;
        this.airline = airline;
        this.seats = seats;
        this.from = from;
        this.to = to;
        this.time = time;

    }
}


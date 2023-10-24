package com.CSCProjectDB.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("flights")
public class Flight {

    @Id
    private String id;

    private int time;

    private String location;

    private  int seats;

Flight() {};
    public Flight(String id, int time, String location, int seats) {

        super();
        this.id = id;
        this.time = time;
        this.location = location;
        this.seats = seats;

    }



}

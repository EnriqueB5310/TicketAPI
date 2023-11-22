package com.CSCProject.TicketAPI.flightmodel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@NoArgsConstructor
@AllArgsConstructor
@Data
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


}

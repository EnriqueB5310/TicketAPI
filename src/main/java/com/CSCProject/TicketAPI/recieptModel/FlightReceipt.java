package com.CSCProject.TicketAPI.recieptModel;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.aggregation.ArithmeticOperators;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Random;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("Receipts")
public class FlightReceipt {
    @Id
    private int id;

    private String customerName;

    private int seats;

    private String time;

    private String airport;

    private String destination;

}



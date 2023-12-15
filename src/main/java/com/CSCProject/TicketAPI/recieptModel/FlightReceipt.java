package com.CSCProject.TicketAPI.recieptModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;





@Document("Receipts")
public class FlightReceipt {
    @Id
    private int id; //randomly generated 6 digit number generated front-end side.

    private String customerName;

    private int seats;

    private String time;

    private String airport;

    private String destination;

    public FlightReceipt(int id, String customerName, int seats, String time, String airport, String destination) {
        super();
        this.id = id;
        this.customerName = customerName;
        this.seats = seats;
        this.time = time;
        this.airport = airport;
        this.destination = destination;
    }

}



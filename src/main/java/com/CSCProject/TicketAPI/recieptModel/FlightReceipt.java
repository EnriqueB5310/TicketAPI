package com.CSCProject.TicketAPI.recieptModel;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor
@Data
@Document("Receipts")
public class FlightReceipt {
    private static int nextId = 100000;

    @Id
    private int id;
    private String customerName;
    private int seats;
    private String time;
    private String airport;
    private String destination;

     public FlightReceipt(String customerName, int seats, String time, String airport, String destination) {
        this.id = nextId++;
        this.customerName = customerName;
        this.seats = seats;
        this.time = time;
        this.airport = airport;
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}

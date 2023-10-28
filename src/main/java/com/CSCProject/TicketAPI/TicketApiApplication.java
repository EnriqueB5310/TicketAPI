package com.CSCProject.TicketAPI;



import com.CSCProject.TicketAPI.repository.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@SpringBootApplication
@EnableMongoRepositories
public class TicketApiApplication  {
	@Autowired
	FlightRepo flights;
	public static void main(String[] args) {
		SpringApplication.run(TicketApiApplication.class, args);
	}

}

package com.CSCProject.TicketAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@SpringBootApplication
@EnableMongoRepositories
public class TicketApiApplication  {

	public static void main(String[] args) {
		SpringApplication.run(TicketApiApplication.class, args);
	}

}

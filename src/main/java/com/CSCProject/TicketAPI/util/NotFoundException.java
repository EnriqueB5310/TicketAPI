package com.CSCProject.TicketAPI.util;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason="Flight Not found")
public class NotFoundException extends RuntimeException {
  // Used in event a the query the user sends doesnt exist
}

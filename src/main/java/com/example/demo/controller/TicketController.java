package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ticket;
import com.example.demo.repository.TicketRepository;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private TicketRepository repo;
	@PostMapping("/bookTickets")
	public String bookTicket(@RequestBody List<Ticket>tickets){
		
	repo.saveAll(tickets);
		return "ticket booked:" + tickets.size();
		
	}
	@GetMapping("/getTickets")
	public List<Ticket> getTicket(){
		return (List<Ticket>) repo.findAll();
		
	
	}
}

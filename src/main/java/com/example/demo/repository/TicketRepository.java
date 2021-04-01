package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Ticket;

public interface TicketRepository extends CrudRepository<Ticket,Integer>{

}

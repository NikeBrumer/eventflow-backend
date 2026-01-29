package ru.eventflow.controller;

import org.springframework.web.bind.annotation.*;
import ru.eventflow.entity.Ticket;
import ru.eventflow.repository.TicketRepository;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {

    private final TicketRepository repository;

    public TicketController(TicketRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Ticket create(@RequestBody Ticket ticket) {
        ticket.setStatus("NEW");
        return repository.save(ticket);
    }

    @GetMapping
    public java.util.List<Ticket> getAll() {
        return repository.findAll();
    }
}



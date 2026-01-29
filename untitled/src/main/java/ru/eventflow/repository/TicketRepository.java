package ru.eventflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.eventflow.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}


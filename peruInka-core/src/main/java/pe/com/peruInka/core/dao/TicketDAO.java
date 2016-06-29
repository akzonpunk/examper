package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Ticket;

public interface TicketDAO {

	List<Ticket>findAllTicket();
	void saveTicket(Ticket ticket);
	Ticket findTicketById(Long id);
	void deleteTicket(Ticket ticket);
	
}

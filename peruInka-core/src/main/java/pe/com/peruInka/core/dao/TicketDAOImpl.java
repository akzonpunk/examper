package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Ticket;

public class TicketDAOImpl extends BaseDAOHibernate implements TicketDAO {

	

	public List<Ticket>findAllTicket(){
		return find(Ticket.class,"from Ticket");
	}
	
	public void saveTicket(Ticket ticket) {
		save(ticket);
	}

	

	public Ticket findTicketById(Long id) {
		return findById(Ticket.class, id);
	}

	public void deleteTicket(Ticket ticket) {
		delete(ticket);
	}
	
	
	
}

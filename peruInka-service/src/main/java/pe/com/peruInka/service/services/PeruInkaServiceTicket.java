package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.peruInka.core.dao.TicketDAO;
import pe.com.peruInka.service.util.Ticket;

@Service("peruInkaServiceTicket ")
public class PeruInkaServiceTicket {
	
	public static List<Ticket> listTicket= new ArrayList<Ticket>();


	@Autowired
	private TicketDAO ticketDAO;
	
	
	public List<pe.com.peruInka.core.domain.Ticket> findAllTicket() {
		return ticketDAO.findAllTicket();
		// 
	}
	
	public void saveTicket(pe.com.peruInka.core.domain.Ticket ticket) {
		// listPerson.add(person);
		ticketDAO.saveTicket(ticket);
	}
	
	public void deleteTicket(Long id) {
		// peruInkaDAO.deletePerson(id);
		List<Ticket> listTicketTemp = new ArrayList<Ticket>();

		for (Ticket ticket: listTicket) {
			if (id.compareTo(ticket.getId()) != 0) {
				listTicketTemp.add(ticket);
			}
			
		}
		listTicket = new ArrayList<Ticket>();
		listTicket.addAll(listTicketTemp);
	}
	
	public void updateTicket(Ticket ticketUpdate) {
		List<Ticket> listTemp = new ArrayList<Ticket>();

		for (Ticket ticket: listTicket) {
			if (ticketUpdate.getId().compareTo(ticket.getId()) == 0) {
				listTemp.add(ticketUpdate);
			} else {
				listTemp.add(ticket);
			}
		}
		listTicket = new ArrayList<Ticket>();
		listTicket.addAll(listTemp);

	}
	
	public Ticket searchTicket(Long id) {
		Ticket ticketReturn = new Ticket();
		for (Ticket ticket: listTicket) {
			if (id.compareTo(ticket.getId()) == 0) {
				ticketReturn = ticket;
				continue;
			}
		}
		return ticketReturn;
	}
	
	

}

package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.peruInka.core.dao.DescriptionTicketDAO;
import pe.com.peruInka.core.domain.StatusTicketDescription;
import pe.com.peruInka.service.util.TicketDescription;

@Service("peruInkaServiceTicketDescription")
public class PeruInkaServiceTicketDescription {

	public static List<TicketDescription> listTicketDescription = new ArrayList<TicketDescription>();


	@Autowired
	private DescriptionTicketDAO descriptionTicketDAO;
	
	public List<StatusTicketDescription> findStatusTicketDescription() {
		return descriptionTicketDAO.findStatusTicketDescription();
	}
	
	public List<pe.com.peruInka.core.domain.DescriptionTicket> findAllDescriptionTicket() {
		return descriptionTicketDAO.findAllDescriptionTicket();
		// 
	}
	
	public void saveDescriptionTicket(pe.com.peruInka.core.domain.DescriptionTicket descriptionTicket) {
		// listPerson.add(person);
		descriptionTicketDAO.saveDescriptionTicket(descriptionTicket);
	}
	
	public void deleteDescriptionTicket(Long id) {
		// peruInkaDAO.deletePerson(id);
		List<TicketDescription> listTicketDescriptionTemp = new ArrayList<TicketDescription>();

		for (TicketDescription ticketDescription: listTicketDescription) {
			if (id.compareTo(ticketDescription.getId()) != 0) {
				listTicketDescriptionTemp.add(ticketDescription);
			}
			
		}
		listTicketDescription = new ArrayList<TicketDescription>();
		listTicketDescription.addAll(listTicketDescriptionTemp);
	}
	
	public void updateTicketDescription(TicketDescription ticketDescriptionUpdate) {
		List<TicketDescription> listTemp = new ArrayList<TicketDescription>();

		for (TicketDescription ticketDescription: listTicketDescription) {
			if (ticketDescriptionUpdate.getId().compareTo(ticketDescription.getId()) == 0) {
				listTemp.add(ticketDescriptionUpdate);
			} else {
				listTemp.add(ticketDescription);
			}
		}
		listTicketDescription = new ArrayList<TicketDescription>();
		listTicketDescription.addAll(listTemp);

	}
	
	public TicketDescription searchTicketDescription(Long id) {
		TicketDescription ticketDescriptionReturn = new TicketDescription();
		for (TicketDescription ticketDescription: listTicketDescription) {
			if (id.compareTo(ticketDescription.getId()) == 0) {
				ticketDescriptionReturn = ticketDescription;
				continue;
			}
		}
		return ticketDescriptionReturn;
	}
	
}

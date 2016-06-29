package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.DescriptionTicket;
import pe.com.peruInka.core.domain.StatusTicketDescription;

public class DescriptionTicketDAOImpl extends BaseDAOHibernate implements DescriptionTicketDAO{

	

	public List<DescriptionTicket>findAllDescriptionTicket(){
		return find(DescriptionTicket.class,"from DescriptionTicket");
	}
	
	public List<StatusTicketDescription> findStatusTicketDescription() {
		return find(StatusTicketDescription.class, "from StatusTicketDescription");
	}

	
	
	
	public void saveDescriptionTicket(DescriptionTicket descriptionTicket) {
		save(descriptionTicket);
	}

	

	public DescriptionTicket findDescriptionTicketById(Long id) {
		return findById(DescriptionTicket.class, id);
	}

	public void deleteDescriptionTicket(DescriptionTicket descriptionTicket) {
		delete(descriptionTicket);
	}
	
	
}

package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.DescriptionTicket;
import pe.com.peruInka.core.domain.StatusTicketDescription;

public interface DescriptionTicketDAO {

	
	 List<DescriptionTicket>findAllDescriptionTicket();
	 List<StatusTicketDescription> findStatusTicketDescription() ;
	 void saveDescriptionTicket(DescriptionTicket descriptionTicket);
	 DescriptionTicket findDescriptionTicketById(Long id);
	 void deleteDescriptionTicket(DescriptionTicket descriptionTicket);
	 
}

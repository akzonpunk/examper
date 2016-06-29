package pe.com.peruInka.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.core.domain.DescriptionTicket;
import pe.com.peruInka.core.domain.StatusTicketDescription;
import pe.com.peruInka.service.services.PeruInkaServiceTicketDescription;

@Controller

public class TicketDescriptionController {

	@Autowired
	private PeruInkaServiceTicketDescription peruInkaServiceTicketDescription;

	@RequestMapping(value = "description/ticketDescription", method = RequestMethod.GET)
	public String ticketDescription(Model model, HttpServletRequest request){
		
		request.getSession().setAttribute("menu", "ticketDescription");
		
		model.addAttribute("ticketDescriptionList", peruInkaServiceTicketDescription.findAllDescriptionTicket());
		
		return "description/ticketDescription";
	}
	
	@RequestMapping(value = "description/frmTicketDescription", method = RequestMethod.GET)
	public String frmTicketDescription(Model model, HttpServletRequest request) {

		model.addAttribute("ticketDescription",new DescriptionTicket());
		return "description/frmTicketDescription";
	}
	
	@RequestMapping(value = "description/deleteTicketDescription", method = RequestMethod.GET)
	public String deleteTicketDescription(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
		peruInkaServiceTicketDescription.deleteDescriptionTicket(id);
		
		return "redirect:ticketDescription";
	}

	
	@RequestMapping(value = "description/saveTicketDescription", method = RequestMethod.POST)
	public String saveticketDescription(Model model, HttpServletRequest request,@ModelAttribute("ticketDescription")DescriptionTicket descriptionTicket) {
		peruInkaServiceTicketDescription.saveDescriptionTicket(descriptionTicket);
		
		return "redirect:ticketDescription";
	}
	
	@RequestMapping(value = "description/editTicketDescription", method = RequestMethod.GET)
	public String editTicketDescription(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
		model.addAttribute("ticketDescription", peruInkaServiceTicketDescription.findAllDescriptionTicket());
		
		return "description/frmTicketDescription";
	}
	
	//para los combos
	@ModelAttribute("statusTicketDescription")
	public List<StatusTicketDescription> StatusTicketDescriptionList(){
		return peruInkaServiceTicketDescription.findStatusTicketDescription();
	}
	
//	@ModelAttribute("typeDocument")
//	public List<TypeDocument> typeDocumentList(){
//		return peruInkaService.findTypeDocument();
//	}
}

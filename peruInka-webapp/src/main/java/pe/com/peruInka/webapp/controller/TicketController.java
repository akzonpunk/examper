package pe.com.peruInka.webapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.peruInka.core.domain.Ticket;
import pe.com.peruInka.service.services.PeruInkaServiceTicket;

@Controller
public class TicketController {

	@Autowired
	private PeruInkaServiceTicket peruInkaServiceTicket;

	@RequestMapping(value = "tickets/ticket", method = RequestMethod.GET)
	public String ticket(Model model, HttpServletRequest request){
		
		request.getSession().setAttribute("menu", "ticket");
		
		model.addAttribute("ticketList", peruInkaServiceTicket.findAllTicket());
		
		return "tickets/ticket";
	}
	
	@RequestMapping(value = "tickets/frmTicket", method = RequestMethod.GET)
	public String frmTicket(Model model, HttpServletRequest request) {

		model.addAttribute("ticket",new Ticket());
		return "ticket/frmTicket";
	}
	
	@RequestMapping(value = "tickets/deleteTicket", method = RequestMethod.GET)
	public String deleteTicket(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
		peruInkaServiceTicket.deleteTicket(id);
		
		return "redirect:ticket";
	}

	
	@RequestMapping(value = "tickets/saveTicket", method = RequestMethod.POST)
	public String saveTicket(Model model, HttpServletRequest request,@ModelAttribute("ticket")Ticket ticket) {
		peruInkaServiceTicket.saveTicket(ticket);
		return "redirect:ticket";
	}
	
	@RequestMapping(value = "tickets/editTicket", method = RequestMethod.GET)
	public String editTicket(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
		model.addAttribute("ticket", peruInkaServiceTicket.findAllTicket());
		
		return "tickets/frmTicket";
	}
	
	//para los combos
//	@ModelAttribute("statusUser")
//	public List<StatusUser> StatusUserList(){
//		return peruInkaService.findStatusUser();
//	}
//	
//	@ModelAttribute("typeDocument")
//	public List<TypeDocument> typeDocumentList(){
//		return peruInkaService.findTypeDocument();
//	}
}

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

import pe.com.peruInka.core.domain.Customer;
import pe.com.peruInka.core.domain.StatusCustomer;
import pe.com.peruInka.service.services.PeruInkaServiceCliente;

@Controller
public class ClienteController {
	
	@Autowired
	private PeruInkaServiceCliente peruInkaServiceCliente;

	@RequestMapping(value = "clientela/cliente", method = RequestMethod.GET)
	public String cliente(Model model, HttpServletRequest request){
		
		request.getSession().setAttribute("menu", "cliente");
		
		model.addAttribute("clienteList", peruInkaServiceCliente.findAllCustomer());
		
		return "clientela/cliente";
	}
	
	@RequestMapping(value = "clientela/frmCliente", method = RequestMethod.GET)
	public String frmcliente(Model model, HttpServletRequest request) {

		model.addAttribute("cliente",new Customer());
		return "clientela/frmCliente";
	}
	
	@RequestMapping(value = "clientela/deleteCliente", method = RequestMethod.GET)
	public String deleteCliente(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
		peruInkaServiceCliente.deleteCustomer(id);
		
		return "redirect:cliente";
	}

	
	@RequestMapping(value = "clientela/saveCliente", method = RequestMethod.POST)
	public String saveCliente(Model model, HttpServletRequest request,@ModelAttribute("Cliente")Customer customer) {
		peruInkaServiceCliente.saveCustomer(customer);
		return "redirect:cliente";
	}
	
//	@RequestMapping(value = "clientela/editCliente", method = RequestMethod.GET)
//	public String editCliente(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
//		model.addAttribute("Cliente", peruInkaServiceCliente.findAllCustomer()Id(id));
//		
//		return "clientela/frmCliente";
//	}
	
	//para los combos
	@ModelAttribute("statusCustomer")
	public List<StatusCustomer> StatusCustomerList(){
		return peruInkaServiceCliente.findStatusCustomer();
	}
	
//	@ModelAttribute("typeDocument")
//	public List<TypeDocument> typeDocumentList(){
//		return peruInkaService.findTypeDocument();
//	}

}

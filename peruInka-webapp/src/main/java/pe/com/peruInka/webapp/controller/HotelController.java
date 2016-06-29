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

import pe.com.peruInka.core.domain.Hotel;
import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.service.services.PeruInkaServiceHotel;

@Controller
public class HotelController {


	@Autowired
	private PeruInkaServiceHotel peruInkaServiceHotel;
	
	@RequestMapping(value = "cadenaHotel/hotel", method = RequestMethod.GET)
	public String hotel(Model model, HttpServletRequest request){
		
		request.getSession().setAttribute("menu", "hotel");
		
		model.addAttribute("hotelList", peruInkaServiceHotel.findAllHotel());
		
		return "cadenaHotel/hotel";
	}
	
	@RequestMapping(value = "cadenaHotel/frmHotel", method = RequestMethod.GET)
	public String frmHotel(Model model, HttpServletRequest request) {

		model.addAttribute("hotel",new Hotel());
		return "cadenaHotel/frmHotel";
	}
	
	@RequestMapping(value = "cadenaHotel/deleteHotel", method = RequestMethod.GET)
	public String deleteHotel(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
		peruInkaServiceHotel.deleteHotel(id);
		
		return "redirect:hotel";
	}

	
	@RequestMapping(value = "cadenaHotel/saveHotel", method = RequestMethod.POST)
	public String saveHotel(Model model, HttpServletRequest request,@ModelAttribute("hotel")Hotel hotel) {
		peruInkaServiceHotel.saveHotel(hotel);
		return "redirect:hotel";
	}
	
//	@RequestMapping(value = "cadenaHotel/editHotel", method = RequestMethod.GET)
//	public String editHotel(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
//		model.addAttribute("hotel", peruInkaServiceHotel.findUserSystemById(id));
//		
//		return "admin/frmUserSystem";
//	}
	
	//para los combos
	@ModelAttribute("statusHotel")
	public List<StatusHotel> StatusHotelList(){
		return peruInkaServiceHotel.findStatusHotel();
	}
//	
//	@ModelAttribute("typeDocument")
//	public List<TypeDocument> typeDocumentList(){
//		return peruInkaService.findTypeDocument();
//	}
//	

	
}

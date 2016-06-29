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

import pe.com.peruInka.core.domain.Product;
import pe.com.peruInka.core.domain.StatusProduct;
import pe.com.peruInka.service.services.PeruInkaServiceProduct;

@Controller
public class ProductController {
	
	@Autowired
	private PeruInkaServiceProduct peruInkaServiceProduct;

	@RequestMapping(value = "productos/product", method = RequestMethod.GET)
	public String product(Model model, HttpServletRequest request){
		
		request.getSession().setAttribute("menu", "product");
		
		model.addAttribute("productList", peruInkaServiceProduct.findAllProduct());
		
		return "productos/product";
	}
	
	@RequestMapping(value = "productos/frmProduct", method = RequestMethod.GET)
	public String frmProduct(Model model, HttpServletRequest request) {

		model.addAttribute("product",new Product());
		return "Productos/frmProduct";
	}
	
	@RequestMapping(value = "productos/deleteProduct", method = RequestMethod.GET)
	public String deleteProduct(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
		peruInkaServiceProduct.deleteProduct(id);
		
		return "redirect:product";
	}

	
	@RequestMapping(value = "productos/saveproduct", method = RequestMethod.POST)
	public String saveproduct(Model model, HttpServletRequest request,@ModelAttribute("product")Product product) {
		peruInkaServiceProduct.saveProduct(product);
		return "redirect:product";
	}
	
	@RequestMapping(value = "productos/editProduct", method = RequestMethod.GET)
	public String editProduct(Model model, HttpServletRequest request,@RequestParam("id") Long id) {
		model.addAttribute("product", peruInkaServiceProduct.findAllProduct());
		
		return "productos/frmProduct";
	}
	
	//para los combos
	@ModelAttribute("statusProduct")
	public List<StatusProduct> StatusProductList(){
		return peruInkaServiceProduct.findStatusProduct();
	}
	
//	@ModelAttribute("typeDocument")
//	public List<TypeDocument> typeDocumentList(){
//		return peruInkaService.findTypeDocument();
//	}


}

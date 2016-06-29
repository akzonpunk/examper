package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.peruInka.core.dao.ProductDAO;
import pe.com.peruInka.core.domain.StatusProduct;
import pe.com.peruInka.service.util.Product;

@Service("peruInkaServiceProduct ")
public class PeruInkaServiceProduct {

	public static List<Product> listProduct = new ArrayList<Product>();


	@Autowired
	private ProductDAO productDAO;
	
	public List<StatusProduct> findStatusProduct() {
		return productDAO.findStatusProduct();
	}
	
	public List<pe.com.peruInka.core.domain.Product> findAllProduct() {
		return productDAO.findAllProduct();
		// 
	}
	
	public void saveProduct(pe.com.peruInka.core.domain.Product product) {
		// listPerson.add(person);
		productDAO.saveProduct(product);
	}
	
	public void deleteProduct(Long id) {
		// peruInkaDAO.deletePerson(id);
		List<Product> listProductTemp = new ArrayList<Product>();

		for (Product product: listProduct) {
			if (id.compareTo(product.getId()) != 0) {
				listProductTemp.add(product);
			}
			
		}
		listProduct = new ArrayList<Product>();
		listProduct.addAll(listProductTemp);
	}
	
	public void updateProduct(Product productUpdate) {
		List<Product> listTemp = new ArrayList<Product>();

		for (Product product: listProduct) {
			if (productUpdate.getId().compareTo(product.getId()) == 0) {
				listTemp.add(productUpdate);
			} else {
				listTemp.add(product);
			}
		}
		listProduct = new ArrayList<Product>();
		listProduct.addAll(listTemp);

	}
	
	public Product searchProduct(Long id) {
		Product productReturn = new Product();
		for (Product product: listProduct) {
			if (id.compareTo(product.getId()) == 0) {
				productReturn = product;
				continue;
			}
		}
		return productReturn;
	}
	
	
}

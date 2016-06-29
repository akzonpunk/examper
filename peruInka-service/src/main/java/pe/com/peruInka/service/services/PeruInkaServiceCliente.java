package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.peruInka.core.dao.ClienteDAO;
import pe.com.peruInka.core.domain.StatusCustomer;
import pe.com.peruInka.service.util.Customer;

@Service("peruInkaServiceCliente ")
public class PeruInkaServiceCliente {
	
	
	public static List<Customer> listCustomer = new ArrayList<Customer>();


	@Autowired
	private ClienteDAO clienteDAO;
	
	public List<StatusCustomer> findStatusCustomer() {
		return clienteDAO.findStatusCustomer();
	}
	
	public List<pe.com.peruInka.core.domain.Customer> findAllCustomer() {
		return clienteDAO.findAllCustomer();
		// 
	}
	
	public void saveCustomer(pe.com.peruInka.core.domain.Customer customer) {
		// listPerson.add(person);
		clienteDAO.saveCustomer(customer);
	}
	
	public void deleteCustomer(Long id) {
		// peruInkaDAO.deletePerson(id);
		List<Customer> listCustomerTemp = new ArrayList<Customer>();

		for (Customer customer: listCustomer) {
			if (id.compareTo(customer.getId()) != 0) {
				listCustomerTemp.add(customer);
			}
			
		}
		listCustomer = new ArrayList<Customer>();
		listCustomer.addAll(listCustomerTemp);
	}
	
	public void updateCustomer(Customer customerUpdate) {
		List<Customer> listTemp = new ArrayList<Customer>();

		for (Customer customer: listCustomer) {
			if (customerUpdate.getId().compareTo(customer.getId()) == 0) {
				listTemp.add(customerUpdate);
			} else {
				listTemp.add(customer);
			}
		}
		listCustomer = new ArrayList<Customer>();
		listCustomer.addAll(listTemp);

	}
	
	public Customer searchCustomer(Long id) {
		Customer customerReturn = new Customer();
		for (Customer customer: listCustomer) {
			if (id.compareTo(customer.getId()) == 0) {
				customerReturn = customer;
				continue;
			}
		}
		return customerReturn;
	}
	

}

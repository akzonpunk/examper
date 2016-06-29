package pe.com.peruInka.service.services;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peruInka.core.domain.Person;

public class PersonDAOImpTest extends AbstractUnitTest {


	@Autowired
	protected PeruInkaService peruInkaService;
	
	public void test() {
		System.out.println(peruInkaService);
	}	
	
}

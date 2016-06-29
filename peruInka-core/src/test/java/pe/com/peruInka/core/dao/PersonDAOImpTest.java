package pe.com.peruInka.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peruInka.core.domain.Person;
import pe.com.peruInka.core.domain.StatusPerson;
import pe.com.peruInka.core.domain.StatusUser;
import pe.com.peruInka.core.domain.UserSystem;

public class PersonDAOImpTest extends AbstractUnitTest {

	@Autowired
	protected PersonDAO personDAO;
	// PersonDAO personDAO = new PersonDAO();

	public void testSaveUserSystem(){
		UserSystem userSystem = new UserSystem();
		userSystem.setUserName("HernanVi");
		userSystem.setUserPassword("12345");
		
		StatusUser statusUser = new StatusUser();
		statusUser.setTypeCode(StatusUser.USER_ACT);
		
		userSystem.setStatusUser(statusUser);
		
		
		Person person = new Person();
		person.setName("Hernan");
		person.setLastNameF("Vilca");
		person.setLastNameM("Masco");
		
		StatusPerson statusPerson= new StatusPerson();
		statusPerson.setTypeCode(StatusPerson.Status.PERSON_ACT.toString());
		person.setStatusPerson(statusPerson);
		
		userSystem.setPerson(person);
		
		personDAO.saveUserSystem(userSystem);
		
		
		setComplete();
		
		
	}
	
	
	public void testFindAllPerson() {
		System.out.println("===" + personDAO.findAllPerson());
	}

	public void testFindAllUser() {
		System.out.println("::::" + personDAO.findUserSystem());

	}

	public void testFindTypeDocument() {
		System.out.println("::::" + personDAO.findTypeDocument());
	}

	public void testSavePerson() {
		testFindAllPerson();
		
		Person person = new Person();
		person.setAddress("Jr: Puno 212121");
		person.setName("Lesly");
		person.setLastNameF("Chahuara");
		person.setLastNameM("Flores");
		
		personDAO.savePerson(person);
		testFindAllPerson();
		setComplete();
		
	}

	public void testFindPersonById(){
		
		System.out.println("::: "+personDAO.findPersonById(5L));
		Person person = personDAO.findPersonById(5L);
		
		System.out.println("Name: "+person.getName());
		System.out.println("Address: "+person.getAddress());
		
	}
	

	public void testDeletePerson(){
		Person person = personDAO.findPersonById(4L);
		personDAO.deletePerson(person);
		setComplete();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

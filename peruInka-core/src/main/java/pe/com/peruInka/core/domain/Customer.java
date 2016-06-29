package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Customer extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String enterPriceId;
	private String personId;
	private StatusCustomer  statusCustomer;
	private Person person;
	private Date dateCreated;
	private Date dateLastUpdated;
	private Date lastUpdateBy;
	
	
	
	public String getEnterPriceId() {
		return enterPriceId;
	}
	public void setEnterPriceId(String enterPriceId) {
		this.enterPriceId = enterPriceId;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public StatusCustomer getStatusCustomer() {
		return statusCustomer;
	}
	public void setStatusCustomer(StatusCustomer statusCustomer) {
		this.statusCustomer = statusCustomer;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(Date dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	public Date getLastUpdateBy() {
		return lastUpdateBy;
	}
	public void setLastUpdateBy(Date lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	

}

package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Ticket  extends BaseEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Date dateIni;
	private Date dateEn;
	private String customerId;
	private Person person;
	private Date dateCreated;
	private Date dateLastUpdated;
	private Date lastUpdateBy;
	
	
	public Date getDateIni() {
		return dateIni;
	}
	public void setDateIni(Date dateIni) {
		this.dateIni = dateIni;
	}
	public Date getDateEn() {
		return dateEn;
	}
	public void setDateEn(Date dateEn) {
		this.dateEn = dateEn;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

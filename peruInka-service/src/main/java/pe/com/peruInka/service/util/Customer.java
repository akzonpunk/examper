package pe.com.peruInka.service.util;

import javax.xml.bind.annotation.XmlRootElement;

public class Customer {

	private Long id;
	private String enterPriceId;
	private String personId;
	private String statusCustomer;
	private String createBy;
	private String dateCreated;
	private String dateLastUpdated;
	private String lastUpdateBy;
	private String version;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getStatusCustomer() {
		return statusCustomer;
	}
	public void setStatusCustomer(String statusCustomer) {
		this.statusCustomer = statusCustomer;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	public String getDateLastUpdated() {
		return dateLastUpdated;
	}
	public void setDateLastUpdated(String dateLastUpdated) {
		this.dateLastUpdated = dateLastUpdated;
	}
	public String getLastUpdateBy() {
		return lastUpdateBy;
	}
	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
}

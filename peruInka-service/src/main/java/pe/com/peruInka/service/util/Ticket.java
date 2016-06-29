package pe.com.peruInka.service.util;

import javax.xml.bind.annotation.XmlRootElement;

public class Ticket {


	private Long id;
	private String dateIni;
	private String dateEn;
	private String customerId;
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
	public String getDateIni() {
		return dateIni;
	}
	public void setDateIni(String dateIni) {
		this.dateIni = dateIni;
	}
	public String getDateEn() {
		return dateEn;
	}
	public void setDateEn(String dateEn) {
		this.dateEn = dateEn;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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

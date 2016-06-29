package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class Product extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private String nameProduct;
	private String priceProduct;
	private String description;
	private String attributes;
	private StatusProduct statusProduct;
	private String hotelId;
	private String productType;
	private Person person;
	private Date dateCreated;
	private Date dateLastUpdated;
	private Date lastUpdateBy;
	
	
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public String getPriceProduct() {
		return priceProduct;
	}
	public void setPriceProduct(String priceProduct) {
		this.priceProduct = priceProduct;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAttributes() {
		return attributes;
	}
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	public StatusProduct getStatusProduct() {
		return statusProduct;
	}
	public void setStatusProduct(StatusProduct statusProduct) {
		this.statusProduct = statusProduct;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
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

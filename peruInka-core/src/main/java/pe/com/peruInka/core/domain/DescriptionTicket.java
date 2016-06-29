package pe.com.peruInka.core.domain;

import java.io.Serializable;
import java.util.Date;

public class DescriptionTicket extends BaseEntity implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private String productId;
	private String ticketId;
	private Number quantity;
	private Number priceUnitary;
	private Number priceAll;
	private String commet;
	private StatusProduct  statusProduct;
	private Date dateCreated;
	private Date dateLastUpdated;
	private Date lastUpdateBy;
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public Number getQuantity() {
		return quantity;
	}
	public void setQuantity(Number quantity) {
		this.quantity = quantity;
	}
	public Number getPriceUnitary() {
		return priceUnitary;
	}
	public void setPriceUnitary(Number priceUnitary) {
		this.priceUnitary = priceUnitary;
	}
	public Number getPriceAll() {
		return priceAll;
	}
	public void setPriceAll(Number priceAll) {
		this.priceAll = priceAll;
	}
	public String getCommet() {
		return commet;
	}
	public void setCommet(String commet) {
		this.commet = commet;
	}
	public StatusProduct getStatusProduct() {
		return statusProduct;
	}
	public void setStatusProduct(StatusProduct statusProduct) {
		this.statusProduct = statusProduct;
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

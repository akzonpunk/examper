package pe.com.peruInka.core.domain;

import java.io.Serializable;

public class Hotel extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private String nameHotel;
	private String ruc;
	private String address;
	private StatusHotel statusHotel;
	private String personId;
	private String root;
	
	
	public String getNameHotel() {
		return nameHotel;
	}
	public void setNameHotel(String nameHotel) {
		this.nameHotel = nameHotel;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public StatusHotel getStatusHotel() {
		return statusHotel;
	}
	public void setStatusHotel(StatusHotel statusHotel) {
		this.statusHotel = statusHotel;
	}
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getRoot() {
		return root;
	}
	public void setRoot(String root) {
		this.root = root;
	}
	
	
	
}

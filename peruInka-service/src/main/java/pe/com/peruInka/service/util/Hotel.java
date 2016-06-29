package pe.com.peruInka.service.util;

import javax.xml.bind.annotation.XmlRootElement;

public class Hotel {


	
	
	private Long id;
	private String nameHotel;
	private String ruc;
	private String address;
	private String statusHotel;
	private String personId;
	private String root;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getStatusHotel() {
		return statusHotel;
	}
	public void setStatusHotel(String statusHotel) {
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

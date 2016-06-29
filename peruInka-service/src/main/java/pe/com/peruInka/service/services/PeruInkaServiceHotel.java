package pe.com.peruInka.service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.peruInka.core.dao.HotelDAO;
import pe.com.peruInka.core.domain.StatusHotel;
import pe.com.peruInka.core.domain.UserSystem;
import pe.com.peruInka.service.util.Hotel;

@Service("peruInkaServiceHotel")
public class PeruInkaServiceHotel {
	
	public static List<Hotel> listHotel = new ArrayList<Hotel>();


	@Autowired
	private HotelDAO hotelDAO;
	
	public List<StatusHotel> findStatusHotel() {
		return hotelDAO.findStatusHotel();
	}
	
	public List<pe.com.peruInka.core.domain.Hotel> findAllHotel() {
		return hotelDAO.findAllHotel();
		// 
	}
	
	
	public void saveHotel(pe.com.peruInka.core.domain.Hotel hotel) {
		// listPerson.add(person);
		hotelDAO.saveHotel(hotel);
	}
	
	public void deleteHotel(Long id) {
		// peruInkaDAO.deletePerson(id);
		List<Hotel> listHotelTemp = new ArrayList<Hotel>();

		for (Hotel hotel: listHotel) {
			if (id.compareTo(hotel.getId()) != 0) {
				listHotelTemp.add(hotel);
			}
			
		}
		listHotel = new ArrayList<Hotel>();
		listHotel.addAll(listHotelTemp);
	}
	
	public void updateHotel(Hotel hotelUpdate) {
		List<Hotel> listTemp = new ArrayList<Hotel>();

		for (Hotel hotel : listHotel) {
			if (hotelUpdate.getId().compareTo(hotel.getId()) == 0) {
				listTemp.add(hotelUpdate);
			} else {
				listTemp.add(hotel);
			}
		}
		listHotel = new ArrayList<Hotel>();
		listHotel.addAll(listTemp);

	}
	
	public Hotel searchHotel(Long id) {
		Hotel hotelReturn = new Hotel();
		for (Hotel hotel: listHotel) {
			if (id.compareTo(hotel.getId()) == 0) {
				hotelReturn = hotel;
				continue;
			}
		}
		return hotelReturn;
	}
	
	
	
	
	
}

package com.springboot.learning;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/booking")
public class BookingController{

	@Autowired
	BookingRepository bookingRepository;
	
	@RequestMapping("/create")
	public Booking create(Booking booking) {
		booking.setTravelDate(new Date());
		booking=(Booking) bookingRepository.save(booking);
		return booking;
	}
	
	@RequestMapping("/read")
	public Booking read(@RequestParam String bookingId) {
		Booking booking = (Booking) bookingRepository.findByDeparture(bookingId);                  
		return booking;
	}
	
	@RequestMapping("/update")
	public Booking update(@RequestParam String bookingId, @RequestParam String psngrName) {
		Booking booking = bookingRepository.findByDeparture(bookingId);
		booking.setPsngrName(psngrName);
		booking= (Booking) bookingRepository.save(booking);
		return booking;
		
	}
	
	 
	public String delete(@RequestParam Long bookingId) {
		bookingRepository.delete(bookingId);
		return "booking #" +bookingId+ "deleted successfully";
	}
}
package com.clinic.support.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clinic.support.dao.BookingRepository;
import com.clinic.support.entity.Booking;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingsRepository;
	
	public void addBooking(Booking bookings) {
		bookingsRepository.save(bookings);
	}
	
	public List<Booking> getBookings(){
		return bookingsRepository.findAll();
	}
	
	public void deleteBookings(Integer id) {
		bookingsRepository.deleteById(id);
	}
	
}

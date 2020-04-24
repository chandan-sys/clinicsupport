package com.clinic.support.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clinic.support.entity.Booking;
import com.clinic.support.service.BookingService;

@RestController
@RequestMapping("booking")
public class BookingController {

	@Autowired
	private BookingService bookingService;

	@PostMapping("/insert")
	public void addBooking(@RequestBody Booking booking) {
		bookingService.addBooking(booking);
	}

	@GetMapping("/get")
	public List<Booking> getBookings() {
		return bookingService.getBookings();
	}

	@DeleteMapping("/delete/{id}")
	public void deleteBookings(@PathVariable("id") Integer id) {
		bookingService.deleteBookings(id);
	}

}

package com.KHaruto.bookingroom.response;

import java.time.LocalDate;

import com.KHaruto.bookingroom.model.Room;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class BookingResponse {
	
	private Long bookingId;
	
	private LocalDate checkInDate;
	
	private LocalDate checkOutDate;
	
	private String guestFullName;
	
	private String guestEmail;
	
	private int numOfAdults;
	
	private int numOfChildren;
	
	private int totalGuest;
	
	private String bookingConfirmationCode;
	
	private Room room;

	public BookingResponse(Long bookingId, LocalDate checkInDate, 
			LocalDate checkOutDate, String bookingConfirmationCode) {
		this.bookingId = bookingId;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.bookingConfirmationCode = bookingConfirmationCode;
	}

}

package com.KHaruto.bookingroom.response;

import java.math.BigDecimal;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoomResponse {
	
	private Long roomId;
	private String roomType;
	private BigDecimal roomPrice;
	private boolean isBooked = false;
	private String photo;
	private List<BookingResponse> bookings;
	
	public RoomResponse(Long roomId, String roomType, BigDecimal roomPrice) {
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
	}

	public RoomResponse(Long roomId, String roomType, BigDecimal roomPrice, 
			boolean isBooked, byte[] photoBytes, List<BookingResponse> bookings) {
		this.roomId = roomId;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.isBooked = isBooked;
		this.photo = photoBytes != null ? Base64.encodeBase64String(photoBytes):null;
		this.bookings = bookings;
	}
	
	
	
}

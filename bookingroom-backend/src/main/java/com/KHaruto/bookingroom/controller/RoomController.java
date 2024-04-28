package com.KHaruto.bookingroom.controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.KHaruto.bookingroom.model.Room;
import com.KHaruto.bookingroom.response.RoomResponse;
import com.KHaruto.bookingroom.service.RoomService;

import lombok.AllArgsConstructor;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/rooms")
public class RoomController {
	
	private final RoomService roomService;
	
	@PostMapping("/add/new-room")
	public ResponseEntity<RoomResponse> addNewRoom(@RequestParam("photo") MultipartFile photo,
			@RequestParam("roomType") String roomType,
			@RequestParam("roomPrice") BigDecimal roomPrice)throws SQLException, IOException{
		Room savedRoom = roomService.addNewRoom(photo, roomType, roomPrice);
		RoomResponse response = new RoomResponse(savedRoom.getRoomId(), savedRoom.getRoomType(),
				savedRoom.getRoomPrice());
		
		return ResponseEntity.ok(response);
	}

	 @GetMapping("/room-types")
	    public List<String> getRoomTypes() {
	        return roomService.getAllRoomTypes();
	    }
	
}

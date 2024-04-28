package com.KHaruto.bookingroom.service;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import javax.sql.rowset.serial.SerialException;

import org.springframework.web.multipart.MultipartFile;

import com.KHaruto.bookingroom.model.Room;

public interface RoomService{
	
	Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException, SerialException, SQLException;

	List<String> getAllRoomTypes();
	
}

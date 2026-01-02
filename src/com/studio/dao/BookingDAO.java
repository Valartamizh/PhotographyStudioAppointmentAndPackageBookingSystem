package com.studio.dao;

import java.sql.Date;
import java.util.List;

import com.studio.bean.Booking;

public class BookingDAO {
	public int generateBookingID() {
		
		return 0;
	}
	
	public boolean recordBooking(Booking booking) {
		
		return false;
	}
	
	public boolean updateBookingStatus(int bookingID,String status) {
		
		return false;
	}
	
	public boolean updateBookingSlot(int bookingID,Date newShootDate,String newStartTime,String newEndTime) {
		
		return false;
	}
	
	public List<Booking> findBookingsByCustomer(String customerID){
		
		return null;
	}
	
	public List<Booking> findBookingsForDate(Date shootDate){
		return null;
	}
}

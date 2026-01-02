package com.studio.service;
import com.studio.bean.*;
import java.util.*;

public class BookingService {

	public Customer viewCustomerDetails(String customerID) {
		
		return null;
	}
	
	public List<Customer> viewAllCustomers(){
		
		return null;
	}
	
	public boolean addNewCustomer(Customer customer) {
		
		return false;
	}
	
	public boolean removeCustomer(String customerID) {
		return false;
	}
	
	public boolean createBooking(String customerID,Date shootDate,String startTime,String endTime,String packageType) {
		
		return false;
	}
	
	public boolean rescheduleBooking(int bookingID,Date newShootDate,String newStartTime,String newEndTime) {
		
		return false;
	}
	
	public boolean cancelBooking(int bookingID) {
		
		return false;
	}
}

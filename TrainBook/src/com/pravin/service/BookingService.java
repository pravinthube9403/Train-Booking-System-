package com.pravin.service;

import java.util.List;

import com.pravin.beans.HistoryBean;
import com.pravin.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}

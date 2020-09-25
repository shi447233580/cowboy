package com.cowboy.cowboy.manager;

import com.cowboy.cowboy.dao.ReservationMapper;
import com.cowboy.cowboy.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForumManagerImpl implements ForumManager{


	@Autowired
	private ReservationMapper reservationMapper;


	@Override
	public int saveFroum(Reservation reservation) {

		return reservationMapper.insert(reservation);
	}
}
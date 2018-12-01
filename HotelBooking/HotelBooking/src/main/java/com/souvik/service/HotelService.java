package com.souvik.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.souvik.dao.Hotel;
import com.souvik.dao.Users;
import com.souvik.repo.HotelRepository;
import com.souvik.repo.UserRepository;


@Service
public class HotelService {
	
	@Autowired
	HotelRepository cdrepository;
	
	@Autowired
	UserRepository user;

	public List<Hotel> getAllHotels() {
		return (List<Hotel>) cdrepository.findAll();
	}

	public int checkcredentials(String username, String password) {
		int count=user.findByUserIdAndPassWord(username, password).size();
		if(count==1)
		{
			return 0;
		}
		else {
			return 2;
		}
	}
	
}

package com.souvik.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.souvik.dao.Hotel;
import com.souvik.service.HotelService;


@RestController
public class myController {

	@Autowired
	HotelService hotelService;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public @ResponseBody String sayHello(){
		return "hello";
	}
	
	@RequestMapping(value = "/hotel", method = RequestMethod.GET)
	public List<Hotel> getAllHotels() {
		return hotelService.getAllHotels();
	}
	
	@RequestMapping(value="/checkcredentials", method = RequestMethod.GET)
	public  @ResponseBody int checkcredentials(@RequestParam("username") String username,@RequestParam("pwd") String password){
		return hotelService.checkcredentials(username,password);
	}
	
}

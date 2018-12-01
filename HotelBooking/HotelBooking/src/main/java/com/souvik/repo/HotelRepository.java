package com.souvik.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.souvik.dao.Hotel;

public interface HotelRepository<C> extends CrudRepository<Hotel, Long>{

	
}

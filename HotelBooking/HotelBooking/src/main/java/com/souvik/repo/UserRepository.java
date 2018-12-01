package com.souvik.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.souvik.dao.Users;

public interface UserRepository<C> extends CrudRepository<Users, Long> {

	List<Users> findByUserIdAndPassWord(String username,String password);
}

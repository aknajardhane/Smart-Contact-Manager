package com.smart.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.smart.entities.User;

public interface UserRepository extends JpaRepository<User,Integer> {
	
	@Query("select u from User u where u.email = :email") //@Query annotation to specify a query within a repository
	public User getUserByUserName(@Param("email") String email); //to give a method parameter a concrete name and bind the name in the query.

}

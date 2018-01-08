package com.mysoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysoft.module.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUserid(Integer userid);

}

package com.nagarro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nagarro.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

package com.nagarro.services;

import java.util.List;

import com.nagarro.entities.User;

public interface UserSortStrategy {
	List<User> sort(List<User> userList);
}

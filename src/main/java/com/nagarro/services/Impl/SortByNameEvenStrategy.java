package com.nagarro.services.Impl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nagarro.entities.User;
import com.nagarro.services.UserSortStrategy;

@Service
public class SortByNameEvenStrategy implements UserSortStrategy {
	@Override
	public List<User> sort(List<User> userList) {
		return userList.stream().sorted(
				Comparator.comparingInt((User u) -> u.getName().length() % 2 == 0 ? 0 : 1).thenComparing(User::getName))
				.collect(Collectors.toList());
	}
}

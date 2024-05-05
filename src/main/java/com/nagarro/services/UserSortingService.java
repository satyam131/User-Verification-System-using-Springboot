package com.nagarro.services;

import org.springframework.stereotype.Service;

import com.nagarro.entities.User;
import com.nagarro.services.Impl.SortByAgeEvenStrategy;
import com.nagarro.services.Impl.SortByAgeOddStrategy;
import com.nagarro.services.Impl.SortByNameEvenStrategy;
import com.nagarro.services.Impl.SortByNameOddStrategy;

import java.util.List;

@Service
public class UserSortingService {

	private final SortByAgeEvenStrategy sortByAgeEvenStrategy;
	private final SortByNameOddStrategy sortByNameOddStrategy;
	private final SortByAgeOddStrategy sortByAgeOddStrategy;
	private final SortByNameEvenStrategy sortByNameEvenStrategy;

	public UserSortingService(SortByAgeEvenStrategy sortByAgeEvenStrategy, SortByNameOddStrategy sortByNameOddStrategy,
			SortByAgeOddStrategy sortByAgeOddStrategy, SortByNameEvenStrategy sortByNameEvenStrategy) {
		this.sortByAgeEvenStrategy = sortByAgeEvenStrategy;
		this.sortByNameOddStrategy = sortByNameOddStrategy;
		this.sortByAgeOddStrategy = sortByAgeOddStrategy;
		this.sortByNameEvenStrategy = sortByNameEvenStrategy;
	}

	public List<User> sortUsers(List<User> userList, String sortType, String sortOrder) {
		UserSortStrategy strategy = determineStrategy(sortType, sortOrder);

		if (strategy != null) {
			return strategy.sort(userList);
		} else {
			return userList;
		}
	}

	private UserSortStrategy determineStrategy(String sortType, String sortOrder) {
		if ("Age".equalsIgnoreCase(sortType) && "Even".equalsIgnoreCase(sortOrder)) {
			return sortByAgeEvenStrategy;
		} else if ("Name".equalsIgnoreCase(sortType) && "Odd".equalsIgnoreCase(sortOrder)) {
			return sortByNameOddStrategy;
		} else if ("Age".equalsIgnoreCase(sortType) && "Odd".equalsIgnoreCase(sortOrder)) {
			return sortByAgeOddStrategy;
		} else if ("Name".equalsIgnoreCase(sortType) && "Even".equalsIgnoreCase(sortOrder)) {
			return sortByNameEvenStrategy;
		}
		return null;
	}
}

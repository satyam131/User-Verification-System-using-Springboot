package com.nagarro.services;

import com.nagarro.payloads.PostResponse;

public interface UserService {

	public PostResponse getAllUsers(Integer offset, Integer pageSize, String sortType, String sortOrder);
}

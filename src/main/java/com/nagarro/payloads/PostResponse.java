package com.nagarro.payloads;

import java.util.List;

import com.nagarro.entities.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PostResponse {
	private List<User> userList;
	private PageInfo pageInfo;
	public List<User> getUserList() {
		return userList;
	}
	public PageInfo getPageInfo() {
		return pageInfo;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public void setPageInfo(PageInfo pageInfo) {
		this.pageInfo = pageInfo;
	}
	
	
}

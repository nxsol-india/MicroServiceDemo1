package com.nxpert.feignservice;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nxpert.entity.UserInfo;

@FeignClient(name="user-microservice")
public interface FeignUserServiceProxy {

	@RequestMapping(method = RequestMethod.GET, value = "/users")
	public List<UserInfo> retrieveUserList();
	
	@RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
	public UserInfo retrieveUser(@PathVariable("id") Long id);
}
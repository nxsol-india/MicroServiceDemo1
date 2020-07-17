/**
 * 
 */
package com.nxpert.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxpert.entity.UserInfo;
import com.nxpert.repository.UserInfoRepository;

@RestController
public class UserInfoController {

	protected Logger logger = Logger
			.getLogger(UserInfoController.class.getName());
	
	@Autowired
	UserInfoRepository userInfoRepository;

	
	@RequestMapping("/users")
	public List<UserInfo> all() {
		logger.info("user-microservice all() invoked");
		List<UserInfo> userInfos = userInfoRepository.findAll();
		logger.info("user-microservice all() found: " + userInfos.size());
		return userInfos;
	}
	
	@RequestMapping("/user/{id}")
	public UserInfo byId(@PathVariable("id") Long id) {
		logger.info("user-microservice byId() invoked: " + id);
		UserInfo  userInfo = userInfoRepository.findOne(id);
		logger.info("user-microservice byId() found: " + userInfo);
		return userInfo;
	}
}

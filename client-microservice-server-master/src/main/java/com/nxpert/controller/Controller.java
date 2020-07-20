/**
 * 
 */
package com.nxpert.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxpert.entity.UserInfo;
import com.nxpert.feignservice.FeignUserServiceProxy;
import com.nxpert.repository.RemoteRepository;
import com.nxpert.webmodel.CourseInfoModel;

@RestController
public class Controller {
	
	@Autowired
	RemoteRepository remoteRepository;
	
	@Autowired
	FeignUserServiceProxy feignUserServiceProxy;
	
	@RequestMapping("/course/{courseId}/{userInfoId}")
	public CourseInfoModel getCoursebyUserIdandCourseId(@PathVariable("courseId") Long courseId, @PathVariable("userInfoId") Long userInfoId) throws Exception {
		
		return remoteRepository.getCourse(courseId,userInfoId);
	}
	
	@RequestMapping("/users")
	public List<UserInfo> all() throws Exception {
		return feignUserServiceProxy.retrieveUserList();
	}
	
	@RequestMapping("/users/{id}")
	public UserInfo userById(@PathVariable("id") Long id) throws Exception {
		return feignUserServiceProxy.retrieveUser(id);
	}
	
	
}

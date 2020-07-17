/**
 * 
 */
package com.nxpert.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxpert.repository.RemoteRepository;
import com.nxpert.webmodel.CourseInfoModel;

@RestController
public class Controller {
	
	@Autowired
	RemoteRepository remoteRepository;
	
	@RequestMapping("/course/{courseId}/{userInfoId}")
	public CourseInfoModel getCoursebyUserIdandCourseId(@PathVariable("courseId") Long courseId, @PathVariable("userInfoId") Long userInfoId) throws Exception {
		
		return remoteRepository.getCourse(courseId,userInfoId);
	}
	
	
}

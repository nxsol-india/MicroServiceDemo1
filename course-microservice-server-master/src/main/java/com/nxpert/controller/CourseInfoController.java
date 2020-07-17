/**
 * 
 */
package com.nxpert.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxpert.entity.CourseInfo;
import com.nxpert.repository.CourseInfoRepository;

@RestController
public class CourseInfoController {

	protected Logger logger = Logger
			.getLogger(CourseInfoController.class.getName());
	
	@Autowired
	CourseInfoRepository courseInfoRepository;
	
	@RequestMapping("/course")
	public List<CourseInfo> all() {
		logger.info("course-microservice all() invoked");
		List<CourseInfo> courseInfos = courseInfoRepository.findAll();
		logger.info("course-microservice all() found: " + courseInfos.size());
		return courseInfos;
	}
	
	@RequestMapping("/course/{id}")
	public CourseInfo byId(@PathVariable("id") Long id) {
		logger.info("course-microservice byId() invoked: " + id);
		CourseInfo course = courseInfoRepository.findOne(id);
		logger.info("course-microservice byId() found: " + course);
		return course;
	}
	
	@PostMapping("/course")
	public CourseInfo save(@RequestBody CourseInfo courseInfo) {
		return courseInfoRepository.save(courseInfo);
		
	}
}

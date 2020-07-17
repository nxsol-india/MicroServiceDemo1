package com.nxpert.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.nxpert.entity.Country;
import com.nxpert.entity.CourseInfo;
import com.nxpert.entity.UserInfo;
import com.nxpert.webmodel.CourseInfoModel;

public class RemoteRepository {
	
	@Autowired
	protected RestTemplate restTemplate;
	
	protected String userServiceUrl;
	protected String courseServiceUrl;
	
	public RemoteRepository(String userServiceUrl, String courseServiceUrl) {
		this.userServiceUrl = userServiceUrl.startsWith("http") ? userServiceUrl : "http://" + userServiceUrl;
		this.courseServiceUrl = courseServiceUrl.startsWith("http") ? courseServiceUrl : "http://" + courseServiceUrl;
	}
	

	public CourseInfoModel getCourse(Long courseId, Long userInfoId) throws Exception {
		CourseInfoModel web = new CourseInfoModel();
		CourseInfo courseInfo = restTemplate.getForObject(courseServiceUrl + "/course/{id}",CourseInfo.class, courseId);
		if (null == courseInfo) 
			throw new Exception("Cource Not Found");
		
		UserInfo userInfo = restTemplate.getForObject(userServiceUrl + "/user/{id}",UserInfo.class, userInfoId);
		if (null == userInfo) 
			throw new Exception("User Not Found");
		
		web.setInstituteName(courseInfo.getInstituteName());
		web.setName(courseInfo.getName());
		web.setId(courseInfo.getId());
		
		Country country =  restTemplate.getForObject(userServiceUrl + "/country/{id}",Country.class, courseInfo.getCourseCountryId());
		web.setCourseCountry(country);
		if(courseInfo.getCourseCountryId() == userInfo.getCountryid() )
			web.setPrice(courseInfo.getPriceDomestic());
		else
			web.setPrice(courseInfo.getPriceInternational());
		
		return web;
	}

}

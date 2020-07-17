package com.nxpert.webmodel;

import com.nxpert.entity.Country;

public class CourseInfoModel {

private Long id;
	
	private String name;
	private Long price;
	private String instituteName;
	private Country courseCountry;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public Country getCourseCountry() {
		return courseCountry;
	}
	public void setCourseCountry(Country courseCountry) {
		this.courseCountry = courseCountry;
	}
	
	

	
	
	
}
/**
 * 
 */
package com.nxpert.entity;

import java.io.Serializable;


public class CourseInfo implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	private Long id;
	
	private String name;
	
	private Long priceDomestic;
	
	private Long priceInternational;
	
	private String instituteName;
	
	private Long courseCountryId;

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

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
	public Long getPriceDomestic() {
		return priceDomestic;
	}

	public void setPriceDomestic(Long priceDomestic) {
		this.priceDomestic = priceDomestic;
	}

	public Long getPriceInternational() {
		return priceInternational;
	}

	public void setPriceInternational(Long priceInternational) {
		this.priceInternational = priceInternational;
	}

	public Long getCourseCountryId() {
		return courseCountryId;
	}

	public void setCourseCountryId(Long courseCountryId) {
		this.courseCountryId = courseCountryId;
	}

	public CourseInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}

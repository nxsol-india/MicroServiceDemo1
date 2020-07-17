/**
 * 
 */
package com.nxpert.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="courseinfo")
public class CourseInfo implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Column(name="price_domestic")
	private Long priceDomestic;
	
	@Column(name="price_international")
	private Long priceInternational;
	
	@Column(name="instituteName")
	private String instituteName;
	
	@Column(name="course_country_id")
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

	@Override
	public String toString() {
		return "CourseInfo [id=" + id + ", name=" + name + ", priceDomestic=" + priceDomestic + ", priceInternational="
				+ priceInternational + ", instituteName=" + instituteName + ", courseCountryId=" + courseCountryId + "]";
	}


	public CourseInfo(Long id, String name, Long priceDomestic, Long priceInternational, String instituteName,
			Long courseCountryId) {
		super();
		this.id = id;
		this.name = name;
		this.priceDomestic = priceDomestic;
		this.priceInternational = priceInternational;
		this.instituteName = instituteName;
		this.courseCountryId = courseCountryId;
	}

	public CourseInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}

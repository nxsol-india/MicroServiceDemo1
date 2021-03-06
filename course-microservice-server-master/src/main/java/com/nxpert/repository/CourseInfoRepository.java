package com.nxpert.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.nxpert.entity.CourseInfo;

@Repository
public interface CourseInfoRepository extends JpaRepository<CourseInfo, Long>, JpaSpecificationExecutor<CourseInfo>{
	
}

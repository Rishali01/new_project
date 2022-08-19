package com.barclays.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.barclays.entity.Department;
import com.barclays.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside save department service" );
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside find department by id service" );
		return departmentRepository.findByDepartmentId(departmentId);
	}
}

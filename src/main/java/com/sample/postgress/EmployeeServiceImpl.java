package com.sample.postgress;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl {
	@Resource
	EmployeeDaoImpl employeeDao;

	public List<Employee> findAll() {
		return employeeDao.findAll();
	}

	public void insertEmployee(Employee emp) {
		employeeDao.insertEmployee(emp);
		
	}

	public void updateEmployee(Employee emp) {
		employeeDao.updateEmployee(emp);
		
	}

	public void executeUpdateEmployee(Employee emp) {
		employeeDao.executeUpdateEmployee(emp);
		
	}


	public void deleteEmployee(Employee emp) {
		employeeDao.deleteEmployee(emp);
		
	}
}

package com.sample.postgress;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/postgressApp")
public class ApplicationController {

	@Resource
	EmployeeServiceImpl employeeService;
	
	@GetMapping(value = "/employeeList")
	public List<Employee> getEmployees() {
		return employeeService.findAll();
	
	}
	
	@PostMapping(value = "/createEmp")
	public void createEmployee(@RequestBody Employee emp) {
		 employeeService.insertEmployee(emp);
	
	}
	@PutMapping(value = "/updateEmp")
	public void updateEmployee(@RequestBody Employee emp) {
		 employeeService.updateEmployee(emp);
	
	}
	@PutMapping(value = "/executeUpdateEmp")
	public void executeUpdateEmployee(@RequestBody Employee emp) {
		 employeeService.executeUpdateEmployee(emp);
	
	}
	
	@DeleteMapping(value = "/deleteEmpById")
	public void deleteEmployee(@RequestBody Employee emp) {
		 employeeService.deleteEmployee(emp);
	
	}
	/////////////////////////////////////////////////////////////////////

	@Resource
	ClienteServiceImpl clienteService;

	@GetMapping(value = "/clienteList")
	public List<Cliente> getClientes() {
		return clienteService.findAll();

	}

	@PostMapping(value = "/createCli")
	public void createCliente(@RequestBody Cliente cli) {
		clienteService.insertCliente(cli);

	}
	@PutMapping(value = "/updatecli")
	public void updateCliente(@RequestBody Cliente cli) {
		clienteService.updateCliente(cli);

	}
	@PutMapping(value = "/executeUpdateCli")
	public void executeUpdateEmployee(@RequestBody Cliente cli) {
		clienteService.executeUpdateCliente(cli);

	}

	@DeleteMapping(value = "/deleteCliById")
	public void deleteEmployee(@RequestBody Cliente cli) {
		clienteService.deleteCliente(cli);

	}
	
}

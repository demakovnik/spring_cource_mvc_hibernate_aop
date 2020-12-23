package com.inofttech.spring_mvc_aop.service;

import com.inofttech.spring_mvc_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployeeById(int id);

    void deleteEmployeeById(int id);
}

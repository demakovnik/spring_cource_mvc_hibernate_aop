package com.inofttech.spring_mvc_aop.dao;

import com.inofttech.spring_mvc_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    Employee getEmployeeById(int id);

    void updateEmployee(Employee employee);

    void deleteEmployeeById(int id);
}

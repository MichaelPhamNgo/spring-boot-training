package com.springboot.app.dao;

import com.springboot.app.domain.Employee;

import java.util.List;

public interface EmployeeDAO {

    Employee getEmployeeById(Integer id);

    List<Employee> getEmployeeByIds(List<Integer> idList);

    Integer getEmployeeCount();

    int addEmployee(Employee employee);
}

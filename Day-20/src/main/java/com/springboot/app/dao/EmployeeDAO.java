package com.bfs.springdataaccess.dao;

import com.bfs.springdataaccess.domain.Employee;

import java.util.List;

public interface EmployeeDAO {

    Employee getEmployeeById(Integer id);

    List<Employee> getEmployeeByIds(List<Integer> idList);

    Integer getEmployeeCount();

    int addEmployee(Employee employee);
}

package com.springboot.app.dao.impl;


import com.springboot.app.domain.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt("eid"));
        employee.setFirstname(resultSet.getString(2));
        employee.setLastname(resultSet.getString(3));
        employee.setEmail(resultSet.getString(4));
        return employee;
    }
}

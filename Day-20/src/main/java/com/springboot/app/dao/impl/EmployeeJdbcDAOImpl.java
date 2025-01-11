package com.springboot.app.dao.impl;


import com.springboot.app.dao.EmployeeDAO;
import com.springboot.app.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("employeeJdbcDao")
public class EmployeeJdbcDAOImpl implements EmployeeDAO {


    private JdbcTemplate jdbcTemplate;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Employee getEmployeeById(Integer id) {

        String sql = "SELECT * FROM Employee where eid = ?";
//        Employee employee = jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(Employee.class));
//        Employee employee = jdbcTemplate.queryForObject(sql, new Object[]{id}, new EmployeeRowMapper());
        Employee employee = jdbcTemplate.queryForObject(sql, new Object[]{id}, (resultSet, i) -> {
            Employee em = new Employee();
            em.setId(resultSet.getInt("eid"));
            em.setFirstname(resultSet.getString(2));
            em.setLastname(resultSet.getString(3));
            em.setEmail(resultSet.getString(4));
            return em;
        });
        return employee;
    }

    @Override
    public List<Employee> getEmployeeByIds(List<Integer> idList) {
        String sql = "SELECT * FROM Employee where eid IN (:idList)";

        MapSqlParameterSource parameterSource = new MapSqlParameterSource();
        parameterSource.addValue("idList", idList);

        List<Employee> employeeList = namedParameterJdbcTemplate
                .query(sql, parameterSource, new EmployeeRowMapper());
        return employeeList;
    }

    @Override
    public Integer getEmployeeCount() {
        String sql = "SELECT count(*) FROM Employee";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public int addEmployee(Employee employee) {
        String sql = "insert into EMPLOYEE (firstname, lastname, email) values (?, ?, ?)";

        return jdbcTemplate.update(sql, employee.getFirstname(), employee.getLastname(), employee.getEmail());
    }
}

package com.bfs.springdataaccess.dao.impl;

import com.bfs.springdataaccess.dao.AbstractHibernateDAO;
import com.bfs.springdataaccess.dao.EmployeeDAO;
import com.bfs.springdataaccess.domain.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("employeeHibernateDao")
public class EmployeeHibernateDAOImpl extends AbstractHibernateDAO<Employee> implements EmployeeDAO {

    public EmployeeHibernateDAOImpl() {
        setClazz(Employee.class);
    }

    @Override
    public Employee getEmployeeById(Integer id) {
        return findById(id);
    }

    @Override
    public List<Employee> getEmployeeByIds(List<Integer> idList) {
        return null;
    }

    @Override
    public Integer getEmployeeCount() {
        return null;
    }

    @Override
    public int addEmployee(Employee employee) {
        this.getCurrentSession().save(employee);
        return 0;
    }
}

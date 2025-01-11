package com.bfs.springdataaccess.service;

import com.bfs.springdataaccess.dao.EmployeeDAO;
import com.bfs.springdataaccess.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

//@Component
@Service
public class EmployeeService {

    private EmployeeDAO employeeJdbcDao;
    private EmployeeDAO employeeHibernateDao;

    @Autowired
    public void setEmployeeJdbcDao(EmployeeDAO employeeJdbcDao) {
        this.employeeJdbcDao = employeeJdbcDao;
    }

    @Autowired
    public void setEmployeeHibernateDao(EmployeeDAO employeeHibernateDao) {
        this.employeeHibernateDao = employeeHibernateDao;
    }

    public void getEmployeeById(int id) {
        Employee employee = employeeJdbcDao.getEmployeeById(id);
        System.out.println(employee);
    }

    public void getEmployeeByIdList(List<Integer> list) {
        List<Employee> employeeList = employeeJdbcDao.getEmployeeByIds(list);
        System.out.println("Get employee by id list:");
        employeeList.forEach(System.out::println);
    }

    public void getEmployeeCount() {
        System.out.println(employeeJdbcDao.getEmployeeCount());
    }

//    @Transactional
    @Transactional(rollbackFor = { Exception.class })
    public void addEmployee(Employee... employeeList) throws Exception {
        for (Employee employee : employeeList) {
            if (employee.getFirstname().length() > 5) {
                throw new RuntimeException("The length of first name should be less than 5!");
            }
            System.out.println("Add employee: " + employee.getFirstname());
            employeeHibernateDao.addEmployee(employee);
        }

    }

    @Transactional
    public void getEmployeeByIdHibernate(int id) {
       Employee employee = employeeHibernateDao.getEmployeeById(id);
       System.out.println("====== "+employee);
    }
}

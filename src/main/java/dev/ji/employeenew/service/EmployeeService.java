package dev.ji.employeenew.service;

import dev.ji.employeenew.model.Employee;

public interface EmployeeService {
    String addEmployee(String firstName, String lastName);

    String removeEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

}

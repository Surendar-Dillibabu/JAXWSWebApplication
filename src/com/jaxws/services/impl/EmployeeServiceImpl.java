package com.jaxws.services.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.jws.WebService;
import com.jaxws.beans.Employee;
import com.jaxws.services.EmployeeService;

@WebService(endpointInterface = "com.jaxws.services.EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

  private static Map<Integer, Employee> employeeMap = new HashMap<>();

  @Override
  public boolean addEmployee(int employeeId, String employeeName, Long salary, int deptId, Date joiningDate) {
    Employee employee = new Employee(employeeId, employeeName, salary, deptId, joiningDate);
    System.out.println("addEmployee :" + employee);
    employeeMap.put(employeeId, employee);
    return true;
  }

  @Override
  public boolean removeEmployee(int employeeId) {
    System.out.println("removeEmployee employeeId :" + employeeId);
    employeeMap.remove(employeeId);
    return true;
  }

  @Override
  public Employee getEmployee(int employeeId) {
    System.out.println("getEmployee employeeId :" + employeeId);
    Employee employeeObj = employeeMap.get(employeeId);
    return employeeObj;
  }

  @Override
  public Employee[] getEmployeeList() {
    System.out.println("getEmployeeList method called");
    Employee[] employeeArr = new Employee[employeeMap.size()];
    return employeeMap.values().toArray(employeeArr);
  }

}

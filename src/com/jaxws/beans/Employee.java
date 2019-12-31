package com.jaxws.beans;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

  /**
   * 
  */
  private static final long serialVersionUID = 1L;

  private int employeeId;
  private String employeeName;
  private Long salary;
  private int deptId;
  private Date joiningDate;

  public Employee() {
  }

  public Employee(int employeeId, String employeeName, Long salary, int deptId, Date joiningDate) {
    this.employeeId = employeeId;
    this.employeeName = employeeName;
    this.salary = salary;
    this.deptId = deptId;
    this.joiningDate = joiningDate;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public Long getSalary() {
    return salary;
  }

  public void setSalary(Long salary) {
    this.salary = salary;
  }

  public int getDeptId() {
    return deptId;
  }

  public void setDeptId(int deptId) {
    this.deptId = deptId;
  }

  public Date getJoiningDate() {
    return joiningDate;
  }

  public void setJoiningDate(Date joiningDate) {
    this.joiningDate = joiningDate;
  }

  @Override
  public String toString() {
    return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + ", deptId="
        + deptId + ", joiningDate=" + joiningDate + "]";
  }

}

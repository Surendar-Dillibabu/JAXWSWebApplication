package com.jaxws.services;

import java.util.Date;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import com.jaxws.beans.Employee;

@WebService
@SOAPBinding(style = Style.RPC)
public interface EmployeeService {

  @WebMethod
  public boolean addEmployee(int employeeId, String employeeName, Long salary, int deptId, Date joiningDate);

  @WebMethod
  public boolean removeEmployee(int employeeId);

  @WebMethod
  public Employee getEmployee(int employeeId);

  @WebMethod
  public Employee[] getEmployeeList();
}

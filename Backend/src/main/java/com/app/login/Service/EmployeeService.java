package com.app.login.Service;

import com.app.login.Dto.EmployeeDTO;
import com.app.login.Dto.LoginDTO;
import com.app.login.response.LoginResponse;

public interface EmployeeService {
    String addEmployee(EmployeeDTO employeeDTO);
    LoginResponse loginEmployee(LoginDTO loginDTO);
}

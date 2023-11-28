package com.app.login.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    @Column(name = "employee_name", length = 255)
    private String employeename;
    @Column(name = "employee_email", length = 255)
    private String email;
    @Column(name = "employee_password", length = 255)
    private String password;

    public Employee(int employeeId, String employeename, String email, String password) {
        this.employeeId = employeeId;
        this.employeename = employeename;
        this.email = email;
        this.password = password;
    }

    public Employee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeeName) {
        this.employeename = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeename + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

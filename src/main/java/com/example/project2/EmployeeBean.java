package com.example.project2.beans;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String name = "John Doe";

    @Autowired
    private com.example.project2.beans.DepartmentBean departmentBean; // Injected Dependency

    public void showEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + departmentBean.getDeptName());
    }
}

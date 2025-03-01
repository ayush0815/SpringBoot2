package com.example.project2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.project2.beans.EmployeeBean;
import com.example.project2.beans.DepartmentBean;



public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.project2.beans");

        EmployeeBean employee = context.getBean(EmployeeBean.class);
        employee.showEmployeeDetails();
    }
}

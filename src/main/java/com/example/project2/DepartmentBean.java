package com.example.project2.beans;



import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String deptName = "IT Department";

    public String getDeptName() {
        return deptName;
    }
}

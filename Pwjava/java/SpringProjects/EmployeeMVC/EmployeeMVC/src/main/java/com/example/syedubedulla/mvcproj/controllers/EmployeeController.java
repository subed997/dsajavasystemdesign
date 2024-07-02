package com.example.syedubedulla.mvcproj.controllers;

import com.example.syedubedulla.mvcproj.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController
{
    @GetMapping("/getform")
    public ModelAndView getRegistrationForm()
    {
        String viewName = "register";
        Map<String, Object> model = new HashMap<>();
        Employee e = new Employee();
        e.setFirstname("John");
        e.setLastname("Doe");
        model.put("employeeEntry",e);
        return new ModelAndView(viewName,model);
    }
}

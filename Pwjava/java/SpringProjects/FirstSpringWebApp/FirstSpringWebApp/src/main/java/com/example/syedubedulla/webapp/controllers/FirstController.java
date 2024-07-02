package com.example.syedubedulla.webapp.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController
{
    @GetMapping
    public String getHelloSpringHomePage()
    {
        return "Hello Spring";
    }
    @GetMapping("search")
    public String getHelloWorld()
    {
        return "Hello World";
    }
    @GetMapping("searching")
    public String searchme(@RequestParam(name = "q") String value)
    {
        return value;
    }
    @GetMapping("searchingpath/{celebrity_name}")
    public String searchmePathVariable(@PathVariable(name = "celebrity_name") String value)
    {
        return value;
    }
    //localhost:8080/post
    @PostMapping(path = "post")
    public void Postme()
    {
        System.out.println("running post");
    }
}

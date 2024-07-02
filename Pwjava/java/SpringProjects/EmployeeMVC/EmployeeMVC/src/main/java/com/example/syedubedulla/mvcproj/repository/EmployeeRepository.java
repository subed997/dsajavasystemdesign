package com.example.syedubedulla.mvcproj.repository;

import com.example.syedubedulla.mvcproj.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

}

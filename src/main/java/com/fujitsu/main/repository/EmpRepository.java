package com.fujitsu.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fujitsu.main.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, Integer> {

}

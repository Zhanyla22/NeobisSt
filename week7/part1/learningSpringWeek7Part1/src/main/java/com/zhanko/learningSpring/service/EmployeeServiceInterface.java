package com.zhanko.learningSpring.service;
import com.zhanko.learningSpring.entity.EmployeeEntity;
import com.zhanko.learningSpring.model.EmployeeModel;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {
    List<EmployeeEntity> getAllEmployee();

    Optional<EmployeeEntity> getEmployeeById(Integer empId);

    EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity);

    ResponseEntity<EmployeeEntity> updateEmployeeById(Integer empId, EmployeeEntity employeeEntity) throws Exception;

    void deleteEmployeeById(Integer empId);



}

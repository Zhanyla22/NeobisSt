package com.zhanko.learningSpring.service;
import com.zhanko.learningSpring.entity.EmployeeEntity;
import com.zhanko.learningSpring.model.EmployeeModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeServiceInterface {
    List<EmployeeEntity> getAllEmployee();

    ResponseEntity<EmployeeModel> getEmployeeById(Integer empId) throws Exception;

    ResponseEntity<EmployeeModel> createNewEmployee(EmployeeModel employeeModel) throws  Exception;

    ResponseEntity<EmployeeModel> updateEmployeeById(Integer empId, EmployeeModel employeeModel) throws Exception;

    void deleteEmployeeById(Integer empId);



}

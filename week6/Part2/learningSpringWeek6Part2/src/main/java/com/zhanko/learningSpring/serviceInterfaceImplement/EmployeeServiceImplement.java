package com.zhanko.learningSpring.serviceInterfaceImplement;

import com.zhanko.learningSpring.entity.EmployeeEntity;
import com.zhanko.learningSpring.repository.EmployeeRepository;
import com.zhanko.learningSpring.service.EmployeeServiceInterface;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplement implements EmployeeServiceInterface {

    @Autowired
    private EmployeeRepository employeeRepository;


    public EmployeeServiceImplement(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeEntity> getAllEmployee(){ // Model
       return employeeRepository.findAll(); //посмотреть еще раз
    }

    @Override
    public Optional<EmployeeEntity>  getEmployeeById(Integer empId) {
        return employeeRepository.findById(empId);

    }

    @Override
    public EmployeeEntity createNewEmployee(EmployeeEntity employeeEntity){
        return  employeeRepository.save(employeeEntity);

    }

    @Override
    public ResponseEntity<EmployeeEntity> updateEmployeeById(Integer empId, EmployeeEntity employeeEntity) throws Exception{ //переделать возвращаем updated и новые updated список,
        try {
            EmployeeEntity employeeFromDB = employeeRepository.findById(empId).get();
            System.out.println(employeeFromDB.toString());
            employeeFromDB.setEmpId(employeeEntity.getEmpId());
            employeeFromDB.setName(employeeEntity.getName());
            employeeFromDB.setLastName(employeeEntity.getLastName());
            employeeFromDB.setDepartment(employeeEntity.getDepartment());
            employeeFromDB.setSalary(employeeEntity.getSalary());
            employeeFromDB.setWorkExperienceYear(employeeEntity.getWorkExperienceYear());
            return new ResponseEntity<EmployeeEntity>(employeeRepository.save(employeeFromDB), HttpStatus.OK);
        }
        catch (Exception e) {
                return new ResponseEntity<EmployeeEntity>(HttpStatus.NOT_FOUND);
            }


    }
    @Override
    public void deleteEmployeeById(Integer empId){
        employeeRepository.deleteById(empId);
    }

}

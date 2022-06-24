package tech.getArrays.employeemanager.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tech.getArrays.employeemanager.model.employee;
import tech.getArrays.employeemanager.service.employeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class employeeController {

    private final employeeService service;

    public employeeController(employeeService service) {
        this.service = service;
    }

    @GetMapping("/getEmp")
    public ResponseEntity<List<employee>> GetAllEmployees(){
        List<employee> lstEmp=service.FindAllEmployee();
        return new ResponseEntity<>(lstEmp, HttpStatus.OK);
    }

    @GetMapping("/getEmp/{id}")
    public ResponseEntity<employee> GetEmployeeById(@PathVariable("id") Long id){
        employee emp=service.FindEmployeeByID(id);
        return new ResponseEntity<>(emp, HttpStatus.OK);
    }

    @PostMapping("/addEmp")
    public ResponseEntity<employee> AddEmployee(@RequestBody employee emp){
        employee newEmployee=service.AddEmployee(emp);
        return new ResponseEntity<>(newEmployee, HttpStatus.OK);
    }

    @PutMapping("/updateEmp/{id}")
    public ResponseEntity<employee> UpdateEmployee(@PathVariable("id") Long id,@RequestBody employee emp){

        employee updatedEmployee=service.UpdateEmployee(emp);
        return new ResponseEntity<>(updatedEmployee, HttpStatus.OK);
    }
    @DeleteMapping("/deleteEmp/{id}")
    public ResponseEntity<?> DeleteEmployeeById(@PathVariable("id") Long id){
       service.DeleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }












}

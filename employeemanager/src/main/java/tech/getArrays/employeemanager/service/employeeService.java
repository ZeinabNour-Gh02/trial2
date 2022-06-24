
package tech.getArrays.employeemanager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getArrays.employeemanager.exception.userNotFoundException;
import tech.getArrays.employeemanager.repository.employeeRepo;
import tech.getArrays.employeemanager.model.employee;

import java.util.List;
import java.util.UUID;

@Service
public class employeeService {

 private final employeeRepo repo ;
    @Autowired
    public employeeService(employeeRepo repo) {
        this.repo = repo;
    }




    public employee AddEmployee(employee emp)
    {
        emp.setEmployeeCode(UUID.randomUUID().toString());
        return repo.save(emp);

    }
    public List<employee> FindAllEmployee()
    {
        return repo.findAll();
    }
    public employee UpdateEmployee(employee emp)
    {

        return repo.save(emp);

    }
    public void DeleteEmployee(Long id)
    {
        repo.deleteById(id);
    }

    public employee FindEmployeeByID(Long id)
    {
        return repo.findEmployeeById(id).orElseThrow(()->new userNotFoundException("Employee with id"+id+"was not found"));
    }






}

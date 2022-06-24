package tech.getArrays.employeemanager.repository;
import org.springframework.stereotype.Repository;
import tech.getArrays.employeemanager.model.employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
@Repository
public interface employeeRepo extends JpaRepository<employee,Long> {


    

    Optional<employee> findEmployeeById(Long id);


}

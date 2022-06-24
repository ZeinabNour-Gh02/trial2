package tech.getArrays.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.getArrays.employeemanager.model.person;

@Repository
public interface personRepo extends JpaRepository <person,Long>{
}

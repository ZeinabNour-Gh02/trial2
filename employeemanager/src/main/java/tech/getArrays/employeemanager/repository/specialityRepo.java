package tech.getArrays.employeemanager.repository;
import org.springframework.stereotype.Repository;
import tech.getArrays.employeemanager.model.speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
@Repository
public interface specialityRepo extends JpaRepository<speciality,Long> {
    Optional<speciality> findDSpecialityById(Long id);
}

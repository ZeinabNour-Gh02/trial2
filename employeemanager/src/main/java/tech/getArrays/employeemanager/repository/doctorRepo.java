package tech.getArrays.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.getArrays.employeemanager.model.doctor;
import tech.getArrays.employeemanager.model.person;
import tech.getArrays.employeemanager.repository.personRepo;
import java.util.Optional;
@Repository
public interface doctorRepo extends JpaRepository<doctor,Long>{
    Optional<doctor> findDoctorById(Long id);

    Long countBySpecialityId(Long id);
}

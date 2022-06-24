package tech.getArrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getArrays.employeemanager.exception.userNotFoundException;
import tech.getArrays.employeemanager.model.doctor;
import tech.getArrays.employeemanager.model.person;
import tech.getArrays.employeemanager.repository.doctorRepo;

import java.util.List;
@Service
public class doctorService {


    private final doctorRepo repo ;
    @Autowired
    public doctorService(doctorRepo repo) {
        this.repo = repo;
    }




    public doctor AddDoctor(doctor doc){
        return repo.save(doc);
    }
    public List<doctor> FindAllDoctor()
    {


        return repo.findAll();
    }
    public doctor UpdateDoctor(doctor doc)
    {

        return repo.save(doc);

    }
    public void DeleteDoctor(Long id)
    {
        repo.deleteById(id);
    }

    public doctor FindDoctorByID(Long id)
    {
        return repo.findDoctorById(id).orElseThrow(()->new userNotFoundException("Doctor with id"+id+"was not found"));
    }

    public Long GetDoctorCount(){

        return repo.count();
    }

    public Long FindNbDoctorBySpeciality(Long id)
    {

        return repo.countBySpecialityId(id);
    }













}

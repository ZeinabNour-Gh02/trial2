package tech.getArrays.employeemanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.getArrays.employeemanager.exception.userNotFoundException;
import tech.getArrays.employeemanager.model.speciality;
import tech.getArrays.employeemanager.repository.specialityRepo;

import java.util.List;
@Service
public class specialityService {


    private final specialityRepo repo ;
    @Autowired

    public specialityService(specialityRepo repo) {
        this.repo = repo;
    }







    public speciality AddSpeciality(speciality spec)
    {
        return repo.save(spec);

    }
    public List<speciality> FindAllSpeciality()
    {
        return repo.findAll();
    }
    public speciality UpdateSpeciality(speciality spec)
    {

        return repo.save(spec);

    }
    public void DeleteSpeciality(Long id)
    {
        repo.deleteById(id);
    }

    public speciality FindSpecialityByID(Long id)
    {
        return repo.findDSpecialityById(id).orElseThrow(()->new userNotFoundException("Speciality with id"+id+"was not found"));
    }



























}

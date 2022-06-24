package tech.getArrays.employeemanager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.getArrays.employeemanager.model.speciality;
import tech.getArrays.employeemanager.service.specialityService;

import java.util.List;
@RestController
@RequestMapping("/speciality")
public class specialityController {




    private final specialityService service;

    public specialityController(specialityService service) {
        this.service = service;
    }

    @GetMapping("/getSpeciality")
    public ResponseEntity<List<speciality>> GetAllSpeciality(){
        List<speciality> lstSpec=service.FindAllSpeciality();
        return new ResponseEntity<>(lstSpec, HttpStatus.OK);
    }

    @GetMapping("/getSpeciality/{id}")
    public ResponseEntity<speciality> GetSpecialityById(@PathVariable("id") Long id){
        speciality spec=service.FindSpecialityByID(id);
        return new ResponseEntity<>(spec, HttpStatus.OK);
    }

    @PostMapping("/addSpeciality")
    public ResponseEntity<speciality> AddSpeciality(@RequestBody speciality spec){
        speciality newSpeciality=service.AddSpeciality(spec);
        return new ResponseEntity<>(newSpeciality, HttpStatus.OK);
    }

    @PutMapping("/updateSpecialty/{id}")
    public ResponseEntity<speciality> UpdateSpeciality(@PathVariable("id") Long id,@RequestBody speciality spec){

        speciality updatedSpeciality=service.UpdateSpeciality(spec);
        return new ResponseEntity<>(updatedSpeciality, HttpStatus.OK);
    }
    @DeleteMapping("/deleteSpeciality/{id}")
    public ResponseEntity<?> DeleteSpecialityById(@PathVariable("id") Long id){
        service.DeleteSpeciality(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

































}

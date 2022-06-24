package tech.getArrays.employeemanager.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import tech.getArrays.employeemanager.model.doctor;
import tech.getArrays.employeemanager.service.doctorService;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class doctorController {



    private final doctorService service;

    public doctorController(doctorService service) {
        this.service = service;
    }

    @GetMapping("/getDoctors")
    public ResponseEntity<List<doctor>> GetAllDoctors(){
        List<doctor> lstDoc=service.FindAllDoctor();
        return new ResponseEntity<>(lstDoc, HttpStatus.OK);
    }

    @GetMapping("/getDoctors/{id}")
    public ResponseEntity<doctor> GetDocotrById(@PathVariable("id") Long id){
        doctor doc=service.FindDoctorByID(id);
        return new ResponseEntity<>(doc, HttpStatus.OK);
    }

    @PostMapping("/addDoctor")
    public ResponseEntity<doctor> AddDoctor(@RequestBody doctor doc){
        doctor newDoctor=service.AddDoctor(doc);
        return new ResponseEntity<>(newDoctor, HttpStatus.OK);
    }

    @PutMapping("/updateDoctor/{id}")
    public ResponseEntity<doctor> UpdateDoctor(@PathVariable("id") Long id,@RequestBody doctor doc){

        doctor updatedDoctor=service.UpdateDoctor(doc);
        return new ResponseEntity<>(updatedDoctor, HttpStatus.OK);
    }
    @DeleteMapping("/deleteDoctor/{id}")
    public ResponseEntity<?> DeleteDoctorById(@PathVariable("id") Long id){
        service.DeleteDoctor(id);
        return new ResponseEntity<>(HttpStatus.OK);


    }























}

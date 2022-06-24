import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {SpecialityService } from './speciality.service';
import { Employee } from './employee';
import { EmployeeService } from './employee.service';
import { Speciality } from './speciality';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {

  constructor(private empService:EmployeeService,private specService:SpecialityService){}
 
    public employee:Employee[];
    public speciality:Speciality[];
public getEmployee():void{

  this.empService.getEmployees()
  .subscribe((response:Employee[])=>{this.employee=response;
  }
  ,(error:HttpErrorResponse)=>{alert(error.message);});

}


public getSpeciality():void{

  this.specService.getSpecialities()
  .subscribe((response:Speciality[])=>{
    this.speciality=response;
    }
  ,(error:HttpErrorResponse)=>{alert(error.message);});

}





ngOnInit(): void {
    this.getEmployee();
    this.getSpeciality();
}

}
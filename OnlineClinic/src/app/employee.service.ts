import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Employee } from './employee';
import { Speciality} from './speciality';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(private http:HttpClient) { }

 private apiServerUrl=environment.apiBaseUrl;
 public getEmployees():Observable<Employee[]>{
    return this.http.get<Employee[]>(`${this.apiServerUrl}/employee/getEmp`);

 }

 public addEmployees(employee:Employee):Observable<Employee>{
  return this.http.post<Employee>(`${this.apiServerUrl}/employee/addEmp`,employee);

}

public updateEmployees(employee:Employee):Observable<Employee>{
  return this.http.put<Employee>(`${this.apiServerUrl}/employee/updateEmp`,employee);

}


public deleteEmployees(id:number):Observable<void>{
  return this.http.delete<void>(`${this.apiServerUrl}/employee/deleteEmp/${id}`);

}
























}

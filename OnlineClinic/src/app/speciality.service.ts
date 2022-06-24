import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Speciality} from './speciality';

@Injectable({
  providedIn: 'root'
})
export class SpecialityService {

  constructor(private http:HttpClient) { }

 private apiServerUrl=environment.apiBaseUrl;
 public getSpecialities():Observable<Speciality[]>{
    return this.http.get<Speciality[]>(`${this.apiServerUrl}/speciality/getSpeciality`);

 }

 public addSpecialities(Speciality:Speciality):Observable<Speciality>{
  return this.http.post<Speciality>(`${this.apiServerUrl}/speciality/addSpeciality`,Speciality);

}

public updateSpecialities(Speciality:Speciality):Observable<Speciality>{
  return this.http.put<Speciality>(`${this.apiServerUrl}/speciality/updateSpeciality`,Speciality);

}


public deleteSpecialities(id:number):Observable<void>{
  return this.http.delete<void>(`${this.apiServerUrl}/speciality/deleteSpeciality/${id}`);

}


public getNbDoctorBySpeciality(id:number):Observable<number>{
  return this.http.get<number>(`${this.apiServerUrl}`);

}
















}

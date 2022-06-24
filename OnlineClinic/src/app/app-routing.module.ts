import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DoctorperSpecialityComponent } from './doctorper-speciality/doctorper-speciality.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './navbar/navbar.component';


const routes: Routes = [
    
  {path:'login',component:LoginComponent},
  {path:'home',component:HomeComponent},
  {path:'home/DoctorsList/:specName',component:DoctorperSpecialityComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

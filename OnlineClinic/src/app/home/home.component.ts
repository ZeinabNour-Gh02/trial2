import { Component, OnInit, ViewChild  } from '@angular/core';
import { NgbCarousel, NgbSlideEvent, NgbSlideEventSource } from '@ng-bootstrap/ng-bootstrap';
import { Router } from '@angular/router';
import { SpecialityService } from '../speciality.service';
import { Speciality } from '../speciality';
import { HttpErrorResponse } from '@angular/common/http';

@Component({selector: 'home', 
templateUrl: './home.component.html',
styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{

 
    index:any[]=[1,2];
 
  public speciality:Speciality[];
  paused = false;
  unpauseOnArrow = false;
  pauseOnIndicator = false;
  pauseOnHover = true;
  pauseOnFocus = true;
disable(){
  
}

constructor(private specService:SpecialityService){

}
ngOnInit(): void {
  this.getSpeciality();
}
public getSpeciality():void{

  this.specService.getSpecialities()
  .subscribe((response:Speciality[])=>{
    this.speciality=response;
    }
  ,(error:HttpErrorResponse)=>{alert(error.message);});

}
  @ViewChild('carousel', {static : true}) carousel: NgbCarousel;

  togglePaused() {
    if (this.paused) {
      this.carousel.cycle();
    } else {
      this.carousel.pause();
    }
    this.paused = !this.paused;
  }

  onSlide(slideEvent: NgbSlideEvent) {
    if (this.unpauseOnArrow && slideEvent.paused &&
      (slideEvent.source === NgbSlideEventSource.ARROW_LEFT || slideEvent.source === NgbSlideEventSource.ARROW_RIGHT)) {
      this.togglePaused();
    }
    if (this.pauseOnIndicator && !slideEvent.paused && slideEvent.source === NgbSlideEventSource.INDICATOR) {
      this.togglePaused();
    }
  }
}
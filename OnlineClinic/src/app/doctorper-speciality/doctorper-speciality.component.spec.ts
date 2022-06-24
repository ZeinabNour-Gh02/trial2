import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DoctorperSpecialityComponent } from './doctorper-speciality.component';

describe('DoctorperSpecialityComponent', () => {
  let component: DoctorperSpecialityComponent;
  let fixture: ComponentFixture<DoctorperSpecialityComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DoctorperSpecialityComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DoctorperSpecialityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});

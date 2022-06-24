package tech.getArrays.employeemanager.model;

import javax.persistence.*;
import java.sql.Date;








@Entity
@DiscriminatorValue(value="doctor")
public class doctor extends person{

    @Column(nullable = false)
    private String education ;
    @Column(nullable = false)
    private String experience;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private float charge;



    //    @ManyToOne(fetch =FetchType.LAZY)
//    @JoinColumn(name = "role_id")
//   private int roleId;
    @ManyToOne(fetch =FetchType.LAZY)
    @JoinColumn(name = "specialityId_id")
    private speciality specialityId;



    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }


    public speciality getSpecialityId() {
        return specialityId;
    }

    public void setSpecialityId(speciality specialityId) {
        this.specialityId = specialityId;
    }


    public doctor() {
    }

    public doctor(Long id, String firstname, String lastname, String address, String email, String mobile, String profile, String gender, Date dateOfBirth, String username, String password, String country, role roleId, String education, String experience, String description, float charge, speciality specialityId) {
        super(id, firstname, lastname, address, email, mobile, profile, gender, dateOfBirth, username, password, country, roleId);
        this.education = education;
        this.experience = experience;
        this.description = description;
        this.charge = charge;
        this.specialityId = specialityId;
    }

    @Override
    public String toString() {
        return "doctor{" +
                "education='" + education + '\'' +
                ", experience='" + experience + '\'' +
                ", description='" + description + '\'' +
                ", charge=" + charge +
                ", specialityId=" + specialityId +
                '}';
    }
}

package tech.getArrays.employeemanager.model;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
public class website {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    @Column(nullable = false)
    private String websiteName;
    @Column(nullable = false)
    private String logo;
    @Column(nullable = false)
    private int numberAdmins;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String instagram;
    @Column(nullable = false)
    private String facebook;
    @Column(nullable = false)
    private String instPassword;
    @Column(nullable = false)
    private String facePassword;
    @Column(nullable = false)
    private String emailPassword;


    public String getWebsiteName() {
        return websiteName;
    }

    public Long getId() {
        return id;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public int getNumberAdmins() {
        return numberAdmins;
    }

    public void setNumberAdmins(int numberAdmins) {
        this.numberAdmins = numberAdmins;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstPassword() {
        return instPassword;
    }

    public void setInstPassword(String instPassword) {
        this.instPassword = instPassword;
    }

    public String getFacePassword() {
        return facePassword;
    }

    public void setFacePassword(String facePassword) {
        this.facePassword = facePassword;
    }

    public String getEmailPassword() {
        return emailPassword;
    }

    public void setEmailPassword(String emailPassword) {
        this.emailPassword = emailPassword;
    }

    public website(Long id, String websiteName, String logo, int numberAdmins, String email, String address, String instagram, String facebook, String instPassword, String facePassword, String emailPassword) {
        this.id = id;
        this.websiteName = websiteName;
        this.logo = logo;
        this.numberAdmins = numberAdmins;
        this.email = email;
        this.address = address;
        this.instagram = instagram;
        this.facebook = facebook;
        this.instPassword = instPassword;
        this.facePassword = facePassword;
        this.emailPassword = emailPassword;
    }

    public website() {
    }

    @Override
    public String toString() {
        return "website{" +
                "websiteName='" + websiteName + '\'' +
                ", logo='" + logo + '\'' +
                ", numberAdmins=" + numberAdmins +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", instagram='" + instagram + '\'' +
                ", facebook='" + facebook + '\'' +
                ", instPassword='" + instPassword + '\'' +
                ", facePassword='" + facePassword + '\'' +
                ", emailPassword='" + emailPassword + '\'' +
                '}';
    }
}

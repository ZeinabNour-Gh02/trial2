package tech.getArrays.employeemanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class speciality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    @Column(nullable = false)
    private String specName;
    @Column(nullable = false)
    private int nbDoctors;

    public String getFullDesc() {
        return fullDesc;
    }

    public void setFullDesc(String fullDesc) {
        this.fullDesc = fullDesc;
    }

    public String getMiniDesc() {
        return miniDesc;
    }

    public void setMiniDesc(String miniDesc) {
        this.miniDesc = miniDesc;
    }

    @Column(nullable = false)
    private String image;
    @Column(nullable = false)
    private String fullDesc;
    @Column(nullable = false)
    private String miniDesc;




    @OneToMany(mappedBy = "specialityId",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private Set<doctor> d;
//
//    public Set<doctor> getD() {
//        return d;
//    }
//
//    public void setD(Set<doctor> d) {
//        this.d = d;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public int getNbDoctors() {
        return nbDoctors;
    }

    public void setNbDoctors(int nbDoctors) {
        this.nbDoctors = nbDoctors;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public speciality(Long id, String specName, int nbDoctors, String image, Set<doctor> d) {
        this.id = id;
        this.specName = specName;
        this.nbDoctors = nbDoctors;
        this.image = image;
        //this.d = d;
    }

    public speciality() {
    }

    @Override
    public String toString() {
        return "speciality{" +
                "id=" + id +
                ", specName='" + specName + '\'' +
                ", nbDoctors=" + nbDoctors +
                ", image='" + image + '\'' +
                // ", d=" + d +
                '}';
    }
}

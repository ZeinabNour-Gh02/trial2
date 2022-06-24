package tech.getArrays.employeemanager.model;
import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity

public class role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String roleName;
    @OneToMany(mappedBy = "roleId",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
       private Set<person> p;
    public Long getId() {
        return id;
    }

    public Collection<person> getP() {
        return p;
    }

    public void setP(Set<person> p) {
        this.p = p;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public role(Long id, String roleName, Set<person> p) {
        this.id = id;
        this.roleName = roleName;
        this.p = p;
    }

    public role() {
    }

    @Override
    public String toString() {
        return "role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", p=" + p +
                '}';
    }
}

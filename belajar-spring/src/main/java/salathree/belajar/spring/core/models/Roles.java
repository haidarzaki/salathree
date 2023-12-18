package salathree.belajar.spring.core.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")

public class Roles {
    @Id
    @GeneratedValue
    private Integer role_id;

    @Column(name = "role_name", length = 100)
    private String role_name;

    public Roles() {
    }

    public Roles(String role_name) {
        this.role_name = role_name;
    }

    public Roles(Integer role_id, String role_name) {
        this.role_id = role_id;
        this.role_name = role_name;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

}

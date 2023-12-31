package salathree.belajar.spring.core.models;

//import java.time.LocalDateTime;

//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "pelanggan")
public class Pelanggan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pelanggan_id;

    @ManyToOne
    @JoinColumn(name = "pelanggan_id")
    private User Pelanggan; // Rename "customer" to "CustomerAddress"

    @Column(length = 64)
    private int budget;
    @Column(length = 12)
    private int phone;
    @Column(length = 16)
    private Order order;

    public Pelanggan(){}
    public Pelanggan(int pelanggan_id, int budget, int phone, Order order){
        this.pelanggan_id = pelanggan_id;
        this.budget = budget;
        this.phone = phone;
        this.order = order;
    }


    public Integer getPelanggan_id() {
        return this.pelanggan_id;
    }

    public void setPelanggan_id(Integer pelanggan_id) {
        this.pelanggan_id = pelanggan_id;
    }

    public User getPelanggan() {
        return this.Pelanggan;
    }

    public void setPelanggan(User Pelanggan) {
        this.Pelanggan = Pelanggan;
    }

    public int getBudget() {
        return this.budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Order getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
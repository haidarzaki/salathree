package salathree.belajar.spring.core.models;

// import java.time.LocalDateTime;

// import org.hibernate.annotations.CreationTimestamp;
// import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "resto")
public class Resto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resto_id")
    private Integer resto_id;

    @Column(name = "phone", length = 12)
    private int phone;

    @Column(name = "alamatResto", length = 12)
    private String alamatResto;

    @Column(name = "makanan", length = 12)
    private Makanan makanan;

    public Resto(){}


    public Resto(Integer resto_id, int phone, String alamatResto, Makanan makanan) {
        this.resto_id = resto_id;
        this.phone = phone;
        this.alamatResto = alamatResto;
        this.makanan = makanan;
    }

    public Integer getResto_id() {
        return this.resto_id;
    }

    public void setResto_id(Integer resto_id) {
        this.resto_id = resto_id;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAlamatResto() {
        return this.alamatResto;
    }

    public void setAlamatResto(String alamatResto) {
        this.alamatResto = alamatResto;
    }

    public Makanan getMakanan() {
        return this.makanan;
    }

    public void setMakanan(Makanan makanan) {
        this.makanan = makanan;
    }
 
}

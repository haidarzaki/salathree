package salathree.belajar.spring.core.models;

import java.time.LocalDateTime;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

// import javax for Column
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer order_id;

    @Column(name = "pesanan", length = 128)
    private Sorted_Menu pesanan;

    @Column(name = "filter", length = 128)
    private Label filter;

    @OneToOne
    @JoinColumn(name = "pelanggan_id")
    private Pelanggan pelanggan_id;
    
    public Order(){}
    

    public Order(Integer order_id, Sorted_Menu pesanan, Label filter, Pelanggan pelanggan_id) {
        this.order_id = order_id;
        this.pesanan = pesanan;
        this.filter = filter;
        this.pelanggan_id = pelanggan_id;
    }

    public Integer getOrder_id() {
        return this.order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Sorted_Menu getPesanan() {
        return this.pesanan;
    }

    public void setPesanan(Sorted_Menu pesanan) {
        this.pesanan = pesanan;
    }

    public Label getFilter() {
        return this.filter;
    }

    public void setFilter(Label filter) {
        this.filter = filter;
    }

    public Pelanggan getPelanggan_id() {
        return this.pelanggan_id;
    }

    public void setPelanggan_id(Pelanggan pelanggan_id) {
        this.pelanggan_id = pelanggan_id;
    }
    
    
}

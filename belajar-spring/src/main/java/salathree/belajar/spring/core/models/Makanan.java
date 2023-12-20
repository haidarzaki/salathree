package salathree.belajar.spring.core.models;

// import java.time.LocalDateTime;
// import java.util.List;

// import org.hibernate.annotations.CreationTimestamp;
// import org.hibernate.annotations.UpdateTimestamp;

// import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.ManyToOne;
// import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Makanan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int makanan_id;

    @Column(name = "nama_makanan", length = 100)
    private String name_makanan;

    @Column(name = "label", length = 100)
    private Label label;

    @Column(name = "harga", length = 100)
    private int harga;

    public Makanan(){}

    public Makanan(int makanan_id, String name_makanan, Label label, int harga) {
        this.makanan_id = makanan_id;
        this.name_makanan = name_makanan;
        this.label = label;
        this.harga = harga;
    }

    public int getMakanan_id() {
        return this.makanan_id;
    }

    public void setMakanan_id(int makanan_id) {
        this.makanan_id = makanan_id;
    }

    public String getName_makanan() {
        return this.name_makanan;
    }

    public void setName_makanan(String name_makanan) {
        this.name_makanan = name_makanan;
    }

    public Label getLabel() {
        return this.label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }


}

    

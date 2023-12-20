package salathree.belajar.spring.core.models;

import java.time.LocalDateTime;
import java.util.ArrayList;
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
@Table(name = "sorted_menu")
public class Sorted_Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "list_menu")
    private ArrayList<String> makanan;

    @Column(name = "resto", length = 128)
    private Resto resto;

    public Sorted_Menu(){}

    public Sorted_Menu(ArrayList<String> makanan, Resto resto) {
        this.makanan = makanan;
        this.resto = resto;
    }


    public ArrayList<String> getMakanan() {
        return this.makanan;
    }

    public void setMakanan(ArrayList<String> makanan) {
        this.makanan = makanan;
    }

    public Resto getResto() {
        return this.resto;
    }

    public void setResto(Resto resto) {
        this.resto = resto;
    }

}

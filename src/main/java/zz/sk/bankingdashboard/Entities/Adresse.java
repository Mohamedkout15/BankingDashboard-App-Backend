package zz.sk.bankingdashboard.Entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Adresse implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String adresse;
    private String ville;
    private String gouvernerat;
    private String codepostal;
    private String pays;



    // Constructor with String arguments
    public Adresse(String adresse, String ville, String gouvernerat, String codepostal, String pays) {
        this.adresse = adresse;
        this.ville = ville;
        this.gouvernerat = gouvernerat;
        this.codepostal = codepostal;
        this.pays = pays;
    }
}

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
    private String adresse ;
    private String ville ;
    private String gouvernerat ;
    private String codepostal ;
    private String pays ;

}

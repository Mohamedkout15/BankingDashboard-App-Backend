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
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idClient ;
    private String nomEntreprise;
    private String email;
    private String domaine;
    private String adresse;
    private String matriculeFiscale;
    private String numtel;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE,CascadeType.MERGE}, orphanRemoval = true)
    @JoinColumn(name = "deuxieme_visite_id_client")
    private DeuxiemeVisite deuxiemeVisite;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE,CascadeType.MERGE}, orphanRemoval = true)
    @JoinColumn(name = "premiere_visite_id_client")
    private PremiereVisite premiereVisite;

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE,CascadeType.MERGE}, orphanRemoval = true)
    @JoinColumn(name = "promesse_client_id_client")
    private PromesseClient promesseClient;
}

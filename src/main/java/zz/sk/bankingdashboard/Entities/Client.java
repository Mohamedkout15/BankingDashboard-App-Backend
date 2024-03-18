package zz.sk.bankingdashboard.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String idClient ;
    private String nomEntreprise;
    private String email;
    private String domaine;
    private String matriculeFiscale;
    private String numtel;

    @OneToOne(cascade = { CascadeType.REMOVE,CascadeType.MERGE}, orphanRemoval = true)
    @JoinColumn(name = "adresse client")
    @JsonProperty
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Adresse adresse;


    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE,CascadeType.MERGE}, orphanRemoval = true)
    @JoinColumn(name = "premiere visite")
    @JsonIgnore
    private PremiereVisite premiereVisite;



    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE,CascadeType.MERGE}, orphanRemoval = true)
    @JoinColumn(name = "deuxieme visite")
    @JsonIgnore
    private DeuxiemeVisite deuxiemeVisite;


    @OneToOne(cascade = { CascadeType.REMOVE,CascadeType.MERGE}, orphanRemoval = true)
    @JoinColumn(name = "promesse client")
    @JsonIgnore
    private PromesseClient promesseClient;



}

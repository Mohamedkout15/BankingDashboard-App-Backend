package zz.sk.bankingdashboard.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class PromesseClient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Number chiffreAffaire;
    private Number placements;
    private Number engagements;
    private Number impayes;
    private Number debit;
    private Number depot;


    public void attprc(Number n1,Number n2,Number n3,Number n4,Number n5,Number n6){
        this.chiffreAffaire=n2;
        this.placements=n1;
        this.engagements=n4;
        this.impayes=n3;
        this.debit=n5;
        this.depot=n6;
    }
}

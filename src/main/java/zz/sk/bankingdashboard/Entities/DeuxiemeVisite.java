package zz.sk.bankingdashboard.Entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class DeuxiemeVisite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd", shape = JsonFormat.Shape.STRING)
    private Date dateDxVisite;

    private Number chiffreAffaire;
    private Number placements;
    private Number engagements;
    private Number impayes;
    private Number debit;
    private Number depot;

    public Date setDatedxvisite(Date date) {
        return this.dateDxVisite = date ;
    }
    public Void attvaldxv(Number n1,Number n2,Number n3,Number n4,Number n5,Number n6){
            this.chiffreAffaire=n2;
            this.placements=n1;
            this.engagements=n4;
            this.impayes=n3;
            this.debit=n5;
            this.depot=n6;
        return null;
    }
}

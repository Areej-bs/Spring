package tn.esprit.spring.tpcafe_areejbensalah.DTO;

import lombok.*;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Detail_Commande;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommandeRequest {
    LocalDate dateCommande;
    float totalCommande;
    List<Detail_Commande> detailC;
}

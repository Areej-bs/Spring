package tn.esprit.spring.tpcafe_areejbensalah.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.spring.tpcafe_areejbensalah.enums.StatusCommande;

import java.time.LocalDate;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idCommande;

    @Column(name = "date_commande")
     LocalDate dateCommande;

    @Column(name = "total_commande")
     float totalCommande;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_commande")
     StatusCommande statusCommande;
    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonBackReference
    Client client;
    @OneToMany(mappedBy = "commande")
    List<Detail_Commande> detailC;
}
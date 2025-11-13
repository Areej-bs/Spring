package tn.esprit.spring.tpcafe_areejbensalah.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

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
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idClient;

    @Column(name = "nom", length = 50, nullable = false)
    String nom;

    @Column(name = "prenom", length = 50, nullable = false)
    String prenom;

    @Column(name = "date_naissance")
    LocalDate dateNaissance;
    @OneToOne
    Adresse adress;
    @OneToOne
    CarteFidelite carte;
    @OneToMany(mappedBy = "client")
    @JsonManagedReference
    List<Commande> commande;
}
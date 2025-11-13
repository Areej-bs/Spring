package tn.esprit.spring.tpcafe_areejbensalah.DTO;

import tn.esprit.spring.tpcafe_areejbensalah.entities.Commande;

import java.util.List;

public class ClientRequest {
    String nom;
    String prenom;
    List<Commande> commande;
}

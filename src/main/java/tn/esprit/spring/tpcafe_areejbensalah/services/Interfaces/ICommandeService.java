package tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces;

import tn.esprit.spring.tpcafe_areejbensalah.entities.Commande;

import java.util.List;

public interface ICommandeService {
    Commande addCommande(Commande u);
    List<Commande> saveCommandes(List<Commande> Commandes);
    Commande selectCommandeByIdWithGet(long id);
    Commande selectCommandeByIdWithOrelse(long id);
    List<Commande> selectAllCommandes();
    void deleteCommande(Commande u);
    void deleteAllCommandes();
    void deleteCommandeById(long id);
    long countingCommandes();
    boolean verifCommandeById(long id);
}

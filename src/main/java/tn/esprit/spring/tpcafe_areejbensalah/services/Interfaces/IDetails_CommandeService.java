package tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces;

import tn.esprit.spring.tpcafe_areejbensalah.entities.Detail_Commande;

import java.util.List;

public interface IDetails_CommandeService {
    Detail_Commande addDetail_Commande(Detail_Commande u);
    List<Detail_Commande> saveDetail_Commande(List<Detail_Commande> Articles);
    Detail_Commande selectDetail_CommandeByIdWithGet(long id);
    Detail_Commande selectDetail_CommandeByIdWithOrelse(long id);
    List<Detail_Commande> selectAllDetail_Commande();
    void deleteDetail_Commande(Detail_Commande u);
    void deleteAllDetail_Commande();
    void deleteDetail_CommandeById(long id);
    long countingDetail_Commande();
    boolean verifDetail_CommandeById(long id);
}

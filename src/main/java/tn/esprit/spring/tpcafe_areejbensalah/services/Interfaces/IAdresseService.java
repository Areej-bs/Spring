package tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces;

import tn.esprit.spring.tpcafe_areejbensalah.entities.Adresse;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Commande;

import java.util.List;

public interface IAdresseService {
    Adresse addAdresse(Adresse u);
    List<Adresse> saveAdresse(List<Adresse> Adresses);
    Adresse selectAdresseByIdWithGet(long id);
    Adresse selectAdresseeByIdWithOrelse(long id);
    List<Adresse> selectAllAdresse();
    void deleteAdresse(Adresse u);
    void deleteAllAdresse();
    void deleteAdresseById(long id);
    long countingAdresse();
    boolean verifAdresseById(long id);
}

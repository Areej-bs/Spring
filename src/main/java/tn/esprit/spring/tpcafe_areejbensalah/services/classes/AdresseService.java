package tn.esprit.spring.tpcafe_areejbensalah.services.classes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Adresse;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Commande;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.AdresseRepository;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.CommandeRepository;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IAdresseService;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.ICommandeService;

import java.util.List;

@Service
@AllArgsConstructor
public class AdresseService implements IAdresseService {
    private AdresseRepository AdresseRepo;
    @Override
    public Adresse addAdresse(Adresse u) {
        return AdresseRepo.save(u);
    }

    @Override
    public List<Adresse> saveAdresse(List<Adresse> Adresses) {
        return AdresseRepo.saveAll(Adresses);
    }


    @Override
    public Adresse selectAdresseByIdWithGet(long id) {
        return AdresseRepo.findById(id).get();
    }

    @Override
    public Adresse selectAdresseeByIdWithOrelse(long id) {
        return null;
    }

    @Override
    public List<Adresse> selectAllAdresse() {
        return AdresseRepo.findAll();
    }

    @Override
    public void deleteAdresse(Adresse u) {
        AdresseRepo.delete(u);
    }



    @Override
    public void deleteAllAdresse() {
        AdresseRepo.deleteAll();
    }

    @Override
    public void deleteAdresseById(long id) {
        AdresseRepo.deleteById(id);
    }

    @Override
    public long countingAdresse() {
        return AdresseRepo.count();
    }

    @Override
    public boolean verifAdresseById(long id) {
        return false;
    }
}

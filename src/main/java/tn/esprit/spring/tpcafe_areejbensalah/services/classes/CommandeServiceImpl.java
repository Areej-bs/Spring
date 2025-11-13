package tn.esprit.spring.tpcafe_areejbensalah.services.classes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.ICommandeService;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Commande;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.CommandeRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class CommandeServiceImpl implements ICommandeService {
    private CommandeRepository CommandeRepo;
    @Override
    public Commande addCommande(Commande u) {
        return CommandeRepo.save(u);
    }

    @Override
    public List<Commande> saveCommandes(List<Commande> Commandes) {
        return CommandeRepo.saveAll(Commandes);
    }

    @Override
    public Commande selectCommandeByIdWithGet(long id) {
        return CommandeRepo.findById(id).get();

    }

    @Override
    public Commande selectCommandeByIdWithOrelse(long id) {
        return null;
    }


    @Override
    public List<Commande> selectAllCommandes() {
        return CommandeRepo.findAll();
    }

    @Override
    public void deleteCommande(Commande u) {
        CommandeRepo.delete(u);
    }

    @Override
    public void deleteAllCommandes() {
        CommandeRepo.deleteAll();
    }

    @Override
    public void deleteCommandeById(long id) {
        CommandeRepo.deleteById(id);
    }

    @Override
    public long countingCommandes() {
        return CommandeRepo.count();
    }

    @Override
    public boolean verifCommandeById(long id) {
        return false;
    }
}

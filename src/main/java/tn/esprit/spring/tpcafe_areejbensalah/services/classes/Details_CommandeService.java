package tn.esprit.spring.tpcafe_areejbensalah.services.classes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Detail_Commande;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.Details_CommandeRepository;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IDetails_CommandeService;

import java.util.List;
@Service
@AllArgsConstructor
public class Details_CommandeService implements IDetails_CommandeService {
    private Details_CommandeRepository Details_CommandeRepo;

    @Override
    public Detail_Commande addDetail_Commande(Detail_Commande u) {
        return Details_CommandeRepo.save(u);
    }

    @Override
    public List<Detail_Commande> saveDetail_Commande(List<Detail_Commande> Detail_Commandes) {
        return Details_CommandeRepo.saveAll(Detail_Commandes);
    }

    @Override
    public Detail_Commande selectDetail_CommandeByIdWithGet(long id) {
        return Details_CommandeRepo.findById(id).get();
    }

    @Override
    public Detail_Commande selectDetail_CommandeByIdWithOrelse(long id) {
        return null;
    }

    @Override
    public List<Detail_Commande> selectAllDetail_Commande() {
        return Details_CommandeRepo.findAll();
    }

    @Override
    public void deleteDetail_Commande(Detail_Commande u) {
        Details_CommandeRepo.delete(u);
    }

    @Override
    public void deleteAllDetail_Commande() {
        Details_CommandeRepo.deleteAll();
    }

    @Override
    public void deleteDetail_CommandeById(long id) {
        Details_CommandeRepo.deleteById(id);
    }

    @Override
    public long countingDetail_Commande() {
        return Details_CommandeRepo.count();
    }

    @Override
    public boolean verifDetail_CommandeById(long id) {
        return false;
    }
}

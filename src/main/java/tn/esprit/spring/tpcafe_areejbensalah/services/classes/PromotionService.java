package tn.esprit.spring.tpcafe_areejbensalah.services.classes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Promotion;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.CommandeRepository;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.PromotionRepository;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IPromotionService;

import java.util.List;
@Service
@AllArgsConstructor
public class PromotionService implements IPromotionService{
    private PromotionRepository PromotionRepo;

    @Override
    public Promotion addPromotion(Promotion u) {
        return PromotionRepo.save(u);
    }

    @Override
    public List<Promotion> savePromotion(List<Promotion> Promotions) {
        return PromotionRepo.saveAll(Promotions);
    }

    @Override
    public Promotion selectPromotionByIdWithGet(long id) {
        return PromotionRepo.findById(id).get();
    }

    @Override
    public Promotion selectPromotionByIdWithOrelse(long id) {
        return null;
    }

    @Override
    public List<Promotion> selectAllPromotion() {
        return PromotionRepo.findAll();
    }

    @Override
    public void deletePromotion(Promotion u) {
        PromotionRepo.delete(u);
    }

    @Override
    public void deleteAllPromotion() {
        PromotionRepo.deleteAll();
    }

    @Override
    public void deletePromotionById(long id) {
        PromotionRepo.deleteById(id);
    }

    @Override
    public long countingPromotion() {
        return PromotionRepo.count();
    }

    @Override
    public boolean verifPromotionById(long id) {
        return false;
    }
}

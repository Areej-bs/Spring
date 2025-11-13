package tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces;

import tn.esprit.spring.tpcafe_areejbensalah.entities.Promotion;

import java.util.List;

public interface IPromotionService {
    Promotion addPromotion(Promotion u);
    List<Promotion> savePromotion(List<Promotion> Promotions);
    Promotion selectPromotionByIdWithGet(long id);
    Promotion selectPromotionByIdWithOrelse(long id);
    List<Promotion> selectAllPromotion();
    void deletePromotion(Promotion u);
    void deleteAllPromotion();
    void deletePromotionById(long id);
    long countingPromotion();
    boolean verifPromotionById(long id);
}

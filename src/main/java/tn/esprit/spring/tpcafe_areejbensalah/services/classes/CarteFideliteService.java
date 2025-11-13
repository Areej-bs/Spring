package tn.esprit.spring.tpcafe_areejbensalah.services.classes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Article;
import tn.esprit.spring.tpcafe_areejbensalah.entities.CarteFidelite;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.ArticleRepository;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.CarteFideliteRepository;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IArticleService;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.ICarteFideliteService;

import java.util.List;
@Service
@AllArgsConstructor
public class CarteFideliteService implements ICarteFideliteService {

    private CarteFideliteRepository CarteFideliteRepo;
    @Override
    public CarteFidelite addCarteFidelite(CarteFidelite u) {
        return CarteFideliteRepo.save(u);
    }

    @Override
    public List<CarteFidelite> saveCarteFidelite(List<CarteFidelite> CarteFidelites) {
        return CarteFideliteRepo.saveAll(CarteFidelites);
    }

    @Override
    public CarteFidelite selectCarteFideliteByIdWithGet(long id) {
        return CarteFideliteRepo.findById(id).get();
    }

    @Override
    public CarteFidelite selectCarteFideliteByIdWithOrelse(long id) {
        return null;
    }

    @Override
    public List<CarteFidelite> selectAllCarteFidelite() {
        return CarteFideliteRepo.findAll();
    }

    @Override
    public void deleteCarteFidelite(CarteFidelite u) {
        CarteFideliteRepo.delete(u);
    }

    @Override
    public void deleteAllCarteFidelite() {
        CarteFideliteRepo.deleteAll();
    }

    @Override
    public void deleteCarteFideliteById(long id) {
        CarteFideliteRepo.deleteById(id);
    }

    @Override
    public long countingCarteFidelite() {
        return CarteFideliteRepo.count();
    }

    @Override
    public boolean verifCarteFideliteById(long id) {
        return false;
    }
}

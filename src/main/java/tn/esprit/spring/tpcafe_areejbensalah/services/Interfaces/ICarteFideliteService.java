package tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces;

import tn.esprit.spring.tpcafe_areejbensalah.entities.Article;
import tn.esprit.spring.tpcafe_areejbensalah.entities.CarteFidelite;

import java.util.List;

public interface ICarteFideliteService {
    CarteFidelite addCarteFidelite(CarteFidelite u);
    List<CarteFidelite> saveCarteFidelite(List<CarteFidelite> CarteFidelites);
    CarteFidelite selectCarteFideliteByIdWithGet(long id);
    CarteFidelite selectCarteFideliteByIdWithOrelse(long id);
    List<CarteFidelite> selectAllCarteFidelite();
    void deleteCarteFidelite(CarteFidelite u);
    void deleteAllCarteFidelite();
    void deleteCarteFideliteById(long id);
    long countingCarteFidelite();
    boolean verifCarteFideliteById(long id);
}


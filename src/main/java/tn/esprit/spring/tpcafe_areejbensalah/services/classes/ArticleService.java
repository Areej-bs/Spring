package tn.esprit.spring.tpcafe_areejbensalah.services.classes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Adresse;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Article;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.AdresseRepository;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.ArticleRepository;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IAdresseService;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IArticleService;

import java.util.List;
@Service
@AllArgsConstructor
public class ArticleService implements IArticleService {
    private ArticleRepository ArticleRepo;
    @Override
    public Article addArticle(Article u) {
        return ArticleRepo.save(u);
    }

    @Override
    public List<Article> saveArticle(List<Article> Articles) {
        return ArticleRepo.saveAll(Articles);
    }


    @Override
    public List<Article> selectAllArticle() {
        return ArticleRepo.findAll();
    }


    @Override
    public Article selectArticleByIdWithGet(long id) {
        return ArticleRepo.findById(id).get();
    }

    @Override
    public Article selectArticleByIdWithOrelse(long id) {
        return null;
    }


    @Override
    public void deleteArticle(Article u) {
        ArticleRepo.delete(u);
    }

    @Override
    public void deleteAllArticle() {
        ArticleRepo.deleteAll();
    }

    @Override
    public void deleteArticleById(long id) {
        ArticleRepo.deleteById(id);
    }

    @Override
    public long countingArticle() {
        return ArticleRepo.count();
    }

    @Override
    public boolean verifArticleById(long id) {
        return false;
    }
}

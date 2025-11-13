package tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces;

import tn.esprit.spring.tpcafe_areejbensalah.entities.Adresse;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Article;

import java.util.List;

public interface IArticleService {
    Article addArticle(Article u);
    List<Article> saveArticle(List<Article> Articles);
    Article selectArticleByIdWithGet(long id);
    Article selectArticleByIdWithOrelse(long id);
    List<Article> selectAllArticle();
    void deleteArticle(Article u);
    void deleteAllArticle();
    void deleteArticleById(long id);
    long countingArticle();
    boolean verifArticleById(long id);
}

package tn.esprit.spring.tpcafe_areejbensalah.RestControllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Article;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Commande;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IArticleService;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.ICommandeService;

import java.util.List;
@RestController
@RequestMapping("/Article")
@AllArgsConstructor
public class ArticleController {

    private IArticleService ArticleService;

    @GetMapping("getAll")
    public List<Article> selectAllArticle(){
        return  ArticleService.selectAllArticle();
    }
    @Operation(
            summary = "Créer une nouvelle commande",
            description = "Cette API permet d'ajouter une commande dans le système. Fournir les détails dans le corps de la requête."
    )
    @PostMapping("/create")
    public Article createArticle(@RequestBody Article article) {
        return ArticleService.addArticle(article);
    }
    @PostMapping("/createAll")
    public List<Article> createAllArticles(@RequestBody List<Article> articles) {
        return ArticleService.saveArticle(articles);
    }
    @GetMapping("get/{id}")
    public  Article selectById(@PathVariable("id") Long id){
        return ArticleService.selectArticleByIdWithGet(id);
    }
    @GetMapping("getparam")
    public  Article selectById2(@RequestParam Long id){
        return ArticleService.selectArticleByIdWithOrelse(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCommandeById(@PathVariable("id") Long id) {
        ArticleService.deleteArticleById(id);
        return "Commande with ID " + id + " deleted successfully.";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllArticle() {
        ArticleService.deleteAllArticle();
        return "All commandes have been deleted successfully.";
    }
}

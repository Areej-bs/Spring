package tn.esprit.spring.tpcafe_areejbensalah.RestControllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Article;
import tn.esprit.spring.tpcafe_areejbensalah.entities.CarteFidelite;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IArticleService;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.ICarteFideliteService;

import java.util.List;
@RestController
@RequestMapping("/CarteFidelite")
@AllArgsConstructor
public class CarteFideliteController {

    private ICarteFideliteService CarteFideliteService;

    @GetMapping("getAll")
    public List<CarteFidelite> selectAllCarteFidelite(){
        return  CarteFideliteService.selectAllCarteFidelite();
    }
    @Operation(
            summary = "Créer une nouvelle commande",
            description = "Cette API permet d'ajouter une commande dans le système. Fournir les détails dans le corps de la requête."
    )
    @PostMapping("/create")
    public CarteFidelite createCarteFidelite(@RequestBody CarteFidelite CarteFidelite) {
        return CarteFideliteService.addCarteFidelite(CarteFidelite);
    }
    @PostMapping("/createAll")
    public List<CarteFidelite> createAllCarteFidelite(@RequestBody List<CarteFidelite> CarteFidelites) {
        return CarteFideliteService.saveCarteFidelite(CarteFidelites);
    }
    @GetMapping("get/{id}")
    public  CarteFidelite selectById(@PathVariable("id") Long id){
        return CarteFideliteService.selectCarteFideliteByIdWithGet(id);
    }
    @GetMapping("getparam")
    public  CarteFidelite selectById2(@RequestParam Long id){
        return CarteFideliteService.selectCarteFideliteByIdWithOrelse(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCarteFideliteById(@PathVariable("id") Long id) {
        CarteFideliteService.deleteCarteFideliteById(id);
        return "Commande with ID " + id + " deleted successfully.";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllCarteFidelite() {
        CarteFideliteService.deleteAllCarteFidelite();
        return "All commandes have been deleted successfully.";
    }
}

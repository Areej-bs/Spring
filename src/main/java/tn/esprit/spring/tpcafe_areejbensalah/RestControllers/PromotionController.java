package tn.esprit.spring.tpcafe_areejbensalah.RestControllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Promotion;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IPromotionService;

import java.util.List;
@RestController
@RequestMapping("/Promotion")
@AllArgsConstructor
public class PromotionController {
    private IPromotionService PromotionService;
    @GetMapping("getAll")
    public List<Promotion> selectAllPromotions(){
        return  PromotionService.selectAllPromotion();
    }
    @Operation(
            summary = "Créer une nouvelle commande",
            description = "Cette API permet d'ajouter une commande dans le système. Fournir les détails dans le corps de la requête."
    )
    @PostMapping("/create")
    public Promotion createPromotion(@RequestBody Promotion Promotion) {
        return PromotionService.addPromotion(Promotion);
    }
    @PostMapping("/createAll")
    public List<Promotion> createAllPromotion(@RequestBody List<Promotion> Promotions) {
        return PromotionService.savePromotion(Promotions);
    }
    @GetMapping("get/{id}")
    public  Promotion selectById(@PathVariable("id") Long id){
        return PromotionService.selectPromotionByIdWithGet(id);
    }
    @GetMapping("getparam")
    public  Promotion selectById2(@RequestParam Long id){
        return PromotionService.selectPromotionByIdWithOrelse(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deletePromotionById(@PathVariable("id") Long id) {
        PromotionService.deletePromotionById(id);
        return "Commande with ID " + id + " deleted successfully.";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllPromotions() {
        PromotionService.deleteAllPromotion();
        return "All commandes have been deleted successfully.";
    }
}

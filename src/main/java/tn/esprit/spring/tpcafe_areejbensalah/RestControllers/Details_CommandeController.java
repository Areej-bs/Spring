package tn.esprit.spring.tpcafe_areejbensalah.RestControllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Commande;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Detail_Commande;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.ICommandeService;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IDetails_CommandeService;

import java.util.List;
@RestController
@RequestMapping("/Details_Commande")
@AllArgsConstructor
public class Details_CommandeController {
    private IDetails_CommandeService Details_CommandeService;
    @GetMapping("getAll")
    public List<Detail_Commande> selectAllDetails_Commande(){
        return  Details_CommandeService.selectAllDetail_Commande();
    }
    @Operation(
            summary = "Créer une nouvelle commande",
            description = "Cette API permet d'ajouter une commande dans le système. Fournir les détails dans le corps de la requête."
    )
    @PostMapping("/create")
    public Detail_Commande createCommande(@RequestBody Detail_Commande Detail_Commande) {
        return Details_CommandeService.addDetail_Commande(Detail_Commande);
    }
    @PostMapping("/createAll")
    public List<Detail_Commande> createAllDetail_Commande(@RequestBody List<Detail_Commande> Detail_Commandes) {
        return Details_CommandeService.saveDetail_Commande(Detail_Commandes);
    }
    @GetMapping("get/{id}")
    public  Detail_Commande selectById(@PathVariable("id") Long id){
        return Details_CommandeService.selectDetail_CommandeByIdWithGet(id);
    }
    @GetMapping("getparam")
    public  Detail_Commande selectById2(@RequestParam Long id){
        return Details_CommandeService.selectDetail_CommandeByIdWithOrelse(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteDetail_CommandeById(@PathVariable("id") Long id) {
        Details_CommandeService.deleteDetail_CommandeById(id);
        return "Commande with ID " + id + " deleted successfully.";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllDetail_Commande() {
        Details_CommandeService.deleteAllDetail_Commande();
        return "All commandes have been deleted successfully.";
    }
}

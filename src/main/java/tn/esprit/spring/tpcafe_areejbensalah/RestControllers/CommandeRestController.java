package tn.esprit.spring.tpcafe_areejbensalah.RestControllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Commande;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.ICommandeService;

import java.util.List;
@RestController
@RequestMapping("/Commande")
@AllArgsConstructor
@Tag(name = "Commande APIs", description = "APIs pour la gestion des commandes du café")

public class CommandeRestController {
    private ICommandeService CommandeService;
    @GetMapping("getAll")
    public List<Commande> selectAllCommandes(){
        return  CommandeService.selectAllCommandes();
    }
    @Operation(
            summary = "Créer une nouvelle commande",
            description = "Cette API permet d'ajouter une commande dans le système. Fournir les détails dans le corps de la requête."
    )
    @PostMapping("/create")
    public Commande createCommande(@RequestBody Commande commande) {
        return CommandeService.addCommande(commande);
    }
    @PostMapping("/createAll")
    public List<Commande> createAllCommandes(@RequestBody List<Commande> commandes) {
        return CommandeService.saveCommandes(commandes);
    }
    @GetMapping("get/{id}")
    public  Commande selectById(@PathVariable("id") Long id){
        return CommandeService.selectCommandeByIdWithGet(id);
    }
    @GetMapping("getparam")
    public  Commande selectById2(@RequestParam Long id){
        return CommandeService.selectCommandeByIdWithOrelse(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCommandeById(@PathVariable("id") Long id) {
        CommandeService.deleteCommandeById(id);
        return "Commande with ID " + id + " deleted successfully.";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllCommandes() {
        CommandeService.deleteAllCommandes();
        return "All commandes have been deleted successfully.";
    }
}

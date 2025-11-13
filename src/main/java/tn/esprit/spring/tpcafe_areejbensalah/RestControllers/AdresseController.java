package tn.esprit.spring.tpcafe_areejbensalah.RestControllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Adresse;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Commande;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IAdresseService;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.ICommandeService;

import java.util.List;
@RestController
@RequestMapping("/Adresse")
@AllArgsConstructor
public class AdresseController {
    private IAdresseService AdresseService;
    @GetMapping("getAll")
    public List<Adresse> selectAllAdresse(){
        return  AdresseService.selectAllAdresse();
    }
    @Operation(
            summary = "Créer une nouvelle commande",
            description = "Cette API permet d'ajouter une commande dans le système. Fournir les détails dans le corps de la requête."
    )
    @PostMapping("/create")
    public Adresse createAdresse(@RequestBody Adresse adresse) {
        return AdresseService.addAdresse(adresse);
    }
    @PostMapping("/createAll")
    public List<Adresse> createAllAdresse(@RequestBody List<Adresse> Adresses) {
        return AdresseService.saveAdresse(Adresses);
    }
    @GetMapping("get/{id}")
    public  Adresse selectById(@PathVariable("id") Long id){
        return AdresseService.selectAdresseByIdWithGet(id);
    }
    @GetMapping("getparam")
    public  Adresse selectById2(@RequestParam Long id){
        return AdresseService.selectAdresseeByIdWithOrelse(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteCommandeById(@PathVariable("id") Long id) {
        AdresseService.deleteAdresseById(id);
        return "Commande with ID " + id + " deleted successfully.";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllAdresse() {
        AdresseService.deleteAllAdresse();
        return "All commandes have been deleted successfully.";
    }
}

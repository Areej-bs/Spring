package tn.esprit.spring.tpcafe_areejbensalah.RestControllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Client;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IClientService;

import java.util.List;
@RestController
@RequestMapping("/Client")
@AllArgsConstructor
public class ClientController {
    private IClientService ClientService;
    @GetMapping("/getAll")
    public String selectAllClient(){
        return  "hello";
    }
    @Operation(
            summary = "Créer une nouvelle commande",
            description = "Cette API permet d'ajouter une commande dans le système. Fournir les détails dans le corps de la requête."
    )
    @PostMapping("/create")
    public Client createClient(@RequestBody Client Client) {
        return ClientService.addClient(Client);
    }
    @PostMapping("/createAll")
    public List<Client> createAllClient(@RequestBody List<Client> Clients) {
        return ClientService.saveClient(Clients);
    }
    @GetMapping("get/{id}")
    public  Client selectById(@PathVariable("id") Long id){
        return ClientService.selectClientByIdWithGet(id);
    }
    @GetMapping("getparam")
    public  Client selectById2(@RequestParam Long id){
        return ClientService.selectClientByIdWithOrelse(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteClientById(@PathVariable("id") Long id) {
        ClientService.deleteClientById(id);
        return "Commande with ID " + id + " deleted successfully.";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAllClient() {
        ClientService.deleteAllClient();
        return "All commandes have been deleted successfully.";
    }
}

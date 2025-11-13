package tn.esprit.spring.tpcafe_areejbensalah.services.classes;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Client;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.ArticleRepository;
import tn.esprit.spring.tpcafe_areejbensalah.repositeries.ClientRepository;
import tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces.IClientService;

import java.util.List;
@Service
@AllArgsConstructor
public class ClientService implements IClientService {
    private ClientRepository ClientRepo;

    @Override
    public Client addClient(Client u) {
        return ClientRepo.save(u);
    }

    @Override
    public List<Client> saveClient(List<Client> Clients) {
        return ClientRepo.saveAll(Clients);
    }

    @Override
    public Client selectClientByIdWithGet(long id) {
        return ClientRepo.findById(id).get();
    }

    @Override
    public Client selectClientByIdWithOrelse(long id) {
        return null;
    }

    @Override
    public List<Client> selectAllClient() {
        return ClientRepo.findAll();
    }

    @Override
    public void deleteClient(Client u) {
        ClientRepo.delete(u);
    }

    @Override
    public void deleteAllClient() {
        ClientRepo.deleteAll();
    }

    @Override
    public void deleteClientById(long id) {
        ClientRepo.deleteById(id);
    }

    @Override
    public long countingClient() {
        return ClientRepo.count();
    }

    @Override
    public boolean verifClientById(long id) {
        return false;
    }
}

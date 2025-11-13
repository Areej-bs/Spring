package tn.esprit.spring.tpcafe_areejbensalah.services.Interfaces;

import tn.esprit.spring.tpcafe_areejbensalah.entities.Client;

import java.util.List;

public interface IClientService {
    Client addClient(Client u);
    List<Client> saveClient(List<Client> Clients);
    Client selectClientByIdWithGet(long id);
    Client selectClientByIdWithOrelse(long id);
    List<Client> selectAllClient();
    void deleteClient(Client u);
    void deleteAllClient();
    void deleteClientById(long id);
    long countingClient();
    boolean verifClientById(long id);
}

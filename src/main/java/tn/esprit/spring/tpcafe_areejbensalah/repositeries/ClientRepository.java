package tn.esprit.spring.tpcafe_areejbensalah.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
}

package tn.esprit.spring.tpcafe_areejbensalah.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Commande;
@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {
}

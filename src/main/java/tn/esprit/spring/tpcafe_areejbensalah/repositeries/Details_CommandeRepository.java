package tn.esprit.spring.tpcafe_areejbensalah.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Detail_Commande;
@Repository
public interface Details_CommandeRepository extends JpaRepository<Detail_Commande, Long> {
}

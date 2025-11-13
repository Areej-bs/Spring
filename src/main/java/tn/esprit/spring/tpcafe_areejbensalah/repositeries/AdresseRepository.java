package tn.esprit.spring.tpcafe_areejbensalah.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Adresse;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {
}

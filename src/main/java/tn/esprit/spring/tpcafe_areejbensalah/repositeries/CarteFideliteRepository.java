package tn.esprit.spring.tpcafe_areejbensalah.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.tpcafe_areejbensalah.entities.CarteFidelite;
@Repository
public interface CarteFideliteRepository extends JpaRepository<CarteFidelite, Long> {
}

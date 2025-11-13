package tn.esprit.spring.tpcafe_areejbensalah.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.tpcafe_areejbensalah.entities.Promotion;
import tn.esprit.spring.tpcafe_areejbensalah.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}

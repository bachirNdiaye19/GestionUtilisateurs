package esp.bachir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import esp.bachir.model.Utilisateur;

@Repository
public interface RepoUser extends JpaRepository<Utilisateur, Integer> {

}

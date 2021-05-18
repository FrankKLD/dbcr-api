package br.com.landingpage.engineapi.persistence;

import br.com.landingpage.engineapi.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LandingRepository extends JpaRepository<User, Long> {

    Optional<List<User>> findByServer(Long idServer);

}


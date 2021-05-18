package br.com.api.persistence;

import br.com.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LandingRepository extends JpaRepository<User, Long> {

    Optional<List<User>> findByServer(Long idServer);

}


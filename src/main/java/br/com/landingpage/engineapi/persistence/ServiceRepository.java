package br.com.landingpage.engineapi.persistence;

import br.com.landingpage.engineapi.domain.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}

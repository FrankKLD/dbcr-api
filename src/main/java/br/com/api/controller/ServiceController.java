package br.com.api.controller;

import br.com.api.persistence.ServiceRepository;
import br.com.api.model.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/service")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class ServiceController {

    private final ServiceRepository serviceRepository;

    @GetMapping("/")
    public ResponseEntity<List<Service>> allServices() {
        List<Service> abc = serviceRepository.findAll();

        if(ObjectUtils.isEmpty(abc)) {
            return ResponseEntity.status(HttpStatus.OK).body(abc);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

//    @GetMapping("/{server}")
//    public ResponseEntity<List<User>> myLands(@PathVariable Long server) {
//        Optional<List<User>> abc = serviceRepository.findByServer(server);
//
//        if(abc.isPresent()) {
//            return ResponseEntity.status(HttpStatus.OK).body(abc.get());
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
//        }
//    }

}

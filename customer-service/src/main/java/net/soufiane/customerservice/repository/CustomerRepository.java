package net.soufiane.customerservice.repository;

import net.soufiane.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
//Il repose sur le concept des repositories Spring Data
//pour créer des endpoints RESTful qui permettent de récupérer,
//créer, modifier et supprimer des entités sans avoir à coder les contrôleurs REST manuellement.
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

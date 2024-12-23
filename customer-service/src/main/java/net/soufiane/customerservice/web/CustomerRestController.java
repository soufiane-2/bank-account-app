package net.soufiane.customerservice.web;

import net.soufiane.customerservice.entities.Customer;
import net.soufiane.customerservice.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerRestController {
    private CustomerRepository costumerRepository ;
    public CustomerRestController(CustomerRepository costumerRepository) {
        this.costumerRepository = costumerRepository;
    }

    @GetMapping("/customers")
    public List<Customer> customerList(){
        return costumerRepository.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer customerById(@PathVariable Long id){
        return costumerRepository.findById(id).get();
    }

}
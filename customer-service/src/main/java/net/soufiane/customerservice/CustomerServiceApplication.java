package net.soufiane.customerservice;

import net.soufiane.customerservice.entities.Customer;
import net.soufiane.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	/*
	objet gerer par le conteneur spring (ioc container)(inversion of controller)
	gere auto les objets d'une app ( créer les objets - injections des dependances)
	*/
	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		/*Interface fonctionnelle qui contient une seule méthode run(String... args).
			Tout code défini dans cette méthode sera exécuté automatiquement
			lorsque l'application démarre.*/
		return args -> {

			List<Customer> customersList = List.of(
					Customer.builder()
							.firstName("soufiane")
							.lastName("siffar")
							.email("soufianesiffar1@gmail.com")
							.build(),

					Customer.builder()
							.firstName("mohamed")
							.lastName("siffar")
							.email("mohamedsiffar1@gmail.com")
							.build()

			);

			customerRepository.saveAll(customersList);


		};
	}

}

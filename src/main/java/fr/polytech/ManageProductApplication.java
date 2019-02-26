package fr.polytech;

import java.util.*;
import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.polytech.dao.*;
import fr.polytech.entities.*;

@SpringBootApplication
public class ManageProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManageProductApplication.class, args);
	}	
		//une methode qui se precede par cette annotation signifie que cette methode va s'executer au premier lors de l'execution du projet
		//Cette methode nous permet d'ajouter via line de commande des categorie
	   // Split() est une fct de chercher espace 
		@Bean
		CommandLineRunner start(CategoryRepository categoryRepo,ProductRepository productRepo) {
			return args->{
				categoryRepo.deleteAll();
				Stream.of("C1 Imprimantes","C2 Portables").forEach(c->{
					categoryRepo.save(new Categorie(c.split(" ")[0],c.split(" ")[1],new ArrayList<>()));	
				});
				
				categoryRepo.findAll().forEach(System.out::println);
				
			};
		}
	

}

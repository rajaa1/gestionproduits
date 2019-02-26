package fr.polytech.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.polytech.entities.Product;

@RepositoryRestResource
public interface ProductRepository extends MongoRepository<Product,String> {

}

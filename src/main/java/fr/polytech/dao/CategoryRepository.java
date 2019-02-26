package fr.polytech.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.polytech.entities.Categorie;
@RepositoryRestResource
public interface CategoryRepository extends MongoRepository<Categorie,String> {




/*Utilisation de API Rest basé sur Spring Data MangoDB 
     Spring Data MongoDB se concentre sur le stockage des données dans MongoDB. 
     Il hérite également des fonctionnalités du projet Spring Data Commons, 
     
    telles que la possibilité de dériver des requêtes. Essentiellement, 
    vous n'avez pas besoin d'apprendre le langage de requête de MongoDB 
     ; vous pouvez simplement écrire une poignée de méthodes et les requêtes sont écrites pour vous
     Spring Data est un ensemble des methode d'accés au données
     Spring Data est découpé en une couche commune à toutes les sources de données (MangoDB,JPA ...) appelée Spring Data Commons
     puis s'ajoute une source propre à la source de données exemple JPARepository ,MangoRepository ..
     Spring Data commons contient des classe pour fonctionner et surtout des interfaces que l'utilisatuer pent etendre(extends)
     PagingandSortingRepository extends CRUDRepository extends Repository
     PagingandSortingRepository contient des methode de pagination et tri plus CRUD
     CRUDRepository contient methode CRUD plus methode de Repository
     Repository contient Methode save ,FindOne,FindAll ..
     puis 
     la couche propre à chaque source de données exemple MangoRepository:
     
     *
     *
     *
     *
     *
    */	
}

package fr.polytech.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Product {
	@Id
	private String idProd;
	private String nameProd;
	private Double price;
	@DBRef
	private Categorie categorie;
	

}

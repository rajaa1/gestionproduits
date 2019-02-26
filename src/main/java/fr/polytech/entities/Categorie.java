package fr.polytech.entities;

import java.util.ArrayList;
import java.util.Collection;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Document
@Data @AllArgsConstructor  @NoArgsConstructor @ToString
public class Categorie {
	@Id @NonNull
	private String idCatego;
	@NonNull
	private String nameCatego;
	@NonNull @DBRef // DBRef define la relation entre Produit et categorie c a d avec cette relation on va creer deux collection une pour Produit et l'autre pour categorie et si on met pas cette relation en va avoir une seule collection et les produit vont etre embarque dans categori
	private Collection<Product> produits = new ArrayList<>();
	
}

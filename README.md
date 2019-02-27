# gestionproduits application web JEE avec Spring IOC et Angular
Remerciement : Je remercie infiniment en premier lieu le professeur Mohamed Youssfi d’avoir partagé son expertise, son savoir-faire avec nous.
   Pour apprendre plus je vous conseille d’accéder à la chaine du prof :    
  https://www.youtube.com/channel/UCCwIYNpQVHZTd3Vx_krnmdA
J’attire votre attention que cette application est le fruit d’un suivi des vidéos de Mr Mohamed Youssfi.
Cette application est application web JEE basé sur le framework Spring et Angular.
La partie backend est basée sur deux micro-services : 
     - Un micro-service basé sur Spring IOC, Spring Data Rest,Spring Data Mongodb qui permet de gérer les produits et les catégories stockés dans une base de données NoSQL MongoDB.
      - Un micro-service d’authentification qui s'occupe de la partie sécurité basée sur Spring IOC,Spring Data REST, Spring Security JPA, Hibernate, Spring Security et Json Web Token (JWT). Dans ce micro-service, les utilisateurs et les rôles sont stockés dans une base de données SQL (H2 ou MySQL). 

- La partie Frontend est basée sur Angular 7
Remarques:
  Spring Data jpa est le moyen privilégié pour accéder aux données des bases de données SQL à l'aide de JPA. Vous pouvez utiliser spring data Rest au-dessus de spring Data jpa pour créer une couche API REST  grâce à Spring Data Rest sans code au-dessus de vos référentiels et de vos entités.

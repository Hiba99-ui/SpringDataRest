package org.ensias.modele;

import java.util.Date;
import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface OffreRepo  extends CrudRepository<Offre, Long>{
        
	
	     
		List<Offre> findByVille(@Param("ville") String ville);
    
		
  		List<Offre> findByDatedebut(@Param("datedebut") Date datedebut);
  		
  		
  		List<Offre> findByDatefin(@Param("datefin") Date datefin);

  		/*
        List<Voiture> findByMarqueAndModele(@Param("marque") String marque, @Param("modele") String modele);
        
        
        List<Voiture> findByMarqueOrCouleur(@Param("marque") String marque, @Param("couleur") String couleur);

       
        List<Voiture> findByMarqueOrderByAnneeAsc(@Param("marque") String marque);*/

      /*  // Sélectionnez les voitures par marque en utilisant SQL
       @Query("select v from Voiture v where v.marque = ?1")
       List<Voiture> findByMarque(String marque);
       @Query("select v from Voiture v where v.marque like %?1")
       List<Voiture> findByMarqueEndsWith(String marque);  
    */
}

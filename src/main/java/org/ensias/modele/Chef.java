package org.ensias.modele;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor

public class Chef {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
	
	@NonNull
    private String cin;
    
	@NonNull
    private String nom;
    
	@NonNull
    private String prenom;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="chef")
	@JsonIgnore
  	private List<Offre> offre; 
    
	@NonNull
    private String tel;

	@NonNull
    private String email;
	
	@NonNull
    private String password;
}

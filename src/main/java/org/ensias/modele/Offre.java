package org.ensias.modele;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NonNull;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor

public class Offre {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
@NonNull
private String datedebut;
@NonNull
private String datefin;
@NonNull
private String nomendroit;

@NonNull
private String adresse;
@NonNull
private String ville;
@NonNull
private String description;
@NonNull

private String image;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "chef")
@NonNull
@JsonIgnore


private Chef chef;




}

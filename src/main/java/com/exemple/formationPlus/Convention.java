package com.exemple.formationPlus;

import com.example.formationplus.Etudiant;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Convention {

    private Integer idConvention;

    private String nomConvention;

    private Integer nbHeur;

    private List<Etudiant> listEtudiant = new ArrayList<>();

    public Convention() {

    }

    public Convention(Integer idConvention, String nomConvention, Integer nbHeur) {
        super();
        this.idConvention = idConvention;
        this.nomConvention = nomConvention;
        this.nbHeur = nbHeur;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getIdConvention() {
        return idConvention;
    }

    public void setIdConvention(Integer idConvention) {
        this.idConvention = idConvention;
    }

    public String getNomConvention() {
        return nomConvention;
    }

    public void setNomConvention(String nomConvention) {
        this.nomConvention = nomConvention;
    }

    public Integer getNbHeur() {
        return nbHeur;
    }

    public void setNbHeur(Integer nbHeur) {
        this.nbHeur = nbHeur;
    }

    @OneToMany(targetEntity= Etudiant.class, mappedBy="conventionEtudiant")
    public List<Etudiant> getListEtudiant() {
        return listEtudiant;
    }

    public void setListEtudiant(List<Etudiant> listEtudiant) {
        this.listEtudiant = listEtudiant;
    }

}

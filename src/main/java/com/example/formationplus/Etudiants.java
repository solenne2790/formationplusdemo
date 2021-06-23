package com.example.formationplus;

import java.util.ArrayList;
import java.util.List;

//on crée une classe pour stocker tous les etudiants dans une liste//
public class Etudiants {

    private List<Etudiant> etudiantList;

    //Methode permettant de retourner toute la liste des etudiants//
    public List<Etudiant> getEtudiantList()
    {
        if(etudiantList == null){

            etudiantList
                    = new ArrayList<>();
        }

        return etudiantList;
    }

    public void setEtudiantList(List<Etudiant> etudiantList)
    {
        this.etudiantList = etudiantList;
    }
}

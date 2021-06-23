package com.example.formationplusdemo;

//creating an entity for student
public class Etudiant {
    public Etudiant() {

    }

    //parametrer le constructeur pour assigner les valeurs aux entites//

    public Etudiant(Integer idEtudiant,String nom,
                    String prenom, String mail,
                    Integer Convention)//faire convention Convention?//

    {
        super();

        this.idEtudiant = idEtudiant;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
    }
     private Integer idEtudiant;

     private String nom;

     private String prenom;

     private String mail;

//overring the toString method to find all the values//
@Override
public String toString() {
  //  return super.toString();
    return "Etudiant [idEtudiant="
         +idEtudiant +",nom="
         +nom + ",prenom="
            +prenom +", mail=";
    //    + mail + "]";
}

    public Integer getIdEtudiant() {

        return idEtudiant;
    }

    public void setIdEtudiant(Integer idEtudiant) {

        this.idEtudiant = idEtudiant;
    }

    public String getNom() {

        return nom;
    }

    public String getPrenom() {

        return prenom;
    }

    public void setPrenom(String prenom) {

        this.prenom = prenom;
    }

    public void setNom(String nom) {

        this.nom = nom;

}

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}








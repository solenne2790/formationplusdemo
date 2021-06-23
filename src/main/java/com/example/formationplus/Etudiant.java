ackage com.exemple.formationPlus;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//creating an entity for student
@Entity
public class Etudiant {

    private Integer idEtudiant;

    private String nomEtudiant;

    private String prenomEtudiant;

    private String mailEtudiant;

    // Jointure avec la convention
    private Convention conventionEtudiant;
    private Long id;

    public Etudiant() {

    }

    //parametrer le constructeur pour assigner les valeurs aux entites

    public Etudiant(Integer idEtudiant,String nomEtudiant,
                    String prenomEtudiant, String mailEtudiant) /*faire convention Convention?*/

    {
        super();

        this.idEtudiant = idEtudiant;
        this.nomEtudiant = nomEtudiant;
        this.prenomEtudiant = prenomEtudiant;
        this.mailEtudiant = mailEtudiant;
    }

    public Integer getIdEtudiant() {

        return idEtudiant;
    }

    public void setIdEtudiant(Integer idEtudiant) {

        this.idEtudiant = idEtudiant;
    }


    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public String getMailEtudiant() {
        return mailEtudiant;
    }

    public void setMailEtudiant(String mailEtudiant) {
        this.mailEtudiant = mailEtudiant;
    }

    @ManyToOne
    @JoinColumn(name="CONVENTION_ID_CONVENTION", nullable=false)
    public Convention getConventionEtudiant() {
        return conventionEtudiant;
    }

    public void setConventionEtudiant(com.exemple.formationPlus.Convention conventionEtudiant) {
        this.conventionEtudiant = conventionEtudiant;
    }

    //overring the toString method to find all the values
    @Override
    public String toString() {
        //  return super.toString();
        return "Etudiant [idEtudiant="
                +idEtudiant +",nom="
                + nomEtudiant + ",prenom="
                + prenomEtudiant +", mail="
                + mailEtudiant + "]";
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}





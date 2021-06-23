package com.example.formationplus;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

    @Entity
    public class Attestation<Etudiant> {

        private Integer idAttestation;

        private Etudiant etudiantAttestation;

        private com.exemple.formationPlus.Convention conventionAttestation;

        private String message;

        public Attestation() {

        }

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Integer getIdAttestation() {
            return idAttestation;
        }

        public void setIdAttestation(Integer idAttestation) {
            this.idAttestation = idAttestation;
        }

        @OneToOne
        @JoinColumn(name="ETUDIANT_ID_ETUDIANT", nullable=false)
        public Etudiant getEtudiantAttestation() {
            return etudiantAttestation;
        }

        public void setEtudiantAttestation(Etudiant etudiantAttestation) {
            this.etudiantAttestation = etudiantAttestation;
        }

        @OneToOne
        @JoinColumn(name="CONVENTION_ID_CONVENTION", nullable=false)
        public com.exemple.formationPlus.Convention getConventionAttestation() {
            return conventionAttestation;
        }

        public void setConventionAttestation(com.exemple.formationPlus.Convention conventionAttestation) {
            this.conventionAttestation = conventionAttestation;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }




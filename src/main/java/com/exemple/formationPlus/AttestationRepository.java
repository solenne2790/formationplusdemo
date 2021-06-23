package com.exemple.formationPlus;

import java.util.List;

import com.example.formationplus.Attestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AttestationRepository extends JpaRepository<Attestation, Integer> {

    @Query(value="SELECT * FROM Attestation")
    public List <Attestation> listAttestation();
}

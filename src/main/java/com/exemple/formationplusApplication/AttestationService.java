package com.exemple.formationplusApplication;

import com.example.formationplus.Attestation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttestationService {

    @Autowired
    private com.exemple.formationPlus.AttestationRepository attestationRepository;

  /*  public void save(Attestation attestation) {
        S save = attestationRepository.save(attestation);
    }
*/
    public void save(Attestation attestation) {
    }
}

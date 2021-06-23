package com.exemple.formationPlus;

import com.example.formationplus.Attestation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AttestationController {

    @Autowired
    private com.exemple.formationPlus.AttestationService attestationService;

    @RequestMapping("/formulaire")
    public String ajoutAttestation(Model model) {
        Attestation attestation = new Attestation();
        model.addAttribute("attestation", attestation);
        return "/formulaire";
    }

    @RequestMapping(value = "/save_formulaire", method = RequestMethod.POST)
    public String saveAttestation(@ModelAttribute("attestation") Attestation attestation) {
        attestationService.save(attestation);
        return "/formulaire";
    }
}

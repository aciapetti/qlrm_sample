package it.deepcyber.sample.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import it.deepcyber.sample.data.projections.InvestigationBaseDecryptedInfoProjection;
import it.deepcyber.sample.data.repositories.InvestigationRepository;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    InvestigationRepository investigationRepository;
    
    @Override
    @Transactional
    public void run(String... args) {
    	// Test custom projections with PosgreSQL native decryption
    	List<InvestigationBaseDecryptedInfoProjection> decryptedInfoOnAllInvestigations = investigationRepository.getBaseDecryptedInfoOnAllInvestigations();
    	decryptedInfoOnAllInvestigations.forEach(i -> System.out.println("INVESTIGATION=\n"+ i.toString()));
    }

}

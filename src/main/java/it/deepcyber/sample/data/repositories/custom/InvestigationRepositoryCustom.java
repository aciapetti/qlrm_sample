package it.deepcyber.sample.data.repositories.custom;

import java.util.List;

import it.deepcyber.sample.data.projections.InvestigationBaseDecryptedInfoProjection;

public interface InvestigationRepositoryCustom {
	
	List<InvestigationBaseDecryptedInfoProjection> getBaseDecryptedInfoOnAllInvestigations();

}

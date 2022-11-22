package it.deepcyber.sample.data.repositories.custom.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.qlrm.mapper.JpaResultMapper;
import org.springframework.beans.factory.annotation.Value;

import it.deepcyber.sample.data.projections.InvestigationBaseDecryptedInfoProjection;
import it.deepcyber.sample.data.queries.SampleNativeQueries;
import it.deepcyber.sample.data.repositories.custom.InvestigationRepositoryCustom;

public class InvestigationRepositoryCustomImpl implements InvestigationRepositoryCustom {
	
	@Value("${encryption.key}")
	String encryptionKey;

	@PersistenceContext
    private EntityManager em;

	@Override
	public List<InvestigationBaseDecryptedInfoProjection> getBaseDecryptedInfoOnAllInvestigations() {
		JpaResultMapper jpaResultMapper = new JpaResultMapper();
		Query query = em.createNativeQuery(String.format(SampleNativeQueries.SELECT_ALL_BASE_INVESTIGATIONS_INFO_DECRYPTED, encryptionKey, encryptionKey));
		return jpaResultMapper.list(query, InvestigationBaseDecryptedInfoProjection.class);
	}

}

package it.deepcyber.sample.data.projections;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.annotations.Type;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(includeFieldNames = true)
public class InvestigationBaseDecryptedInfoProjection implements Serializable {
	
	private static final long serialVersionUID = 6273624216615592168L;

	@Type(type="org.hibernate.type.PostgresUUIDType")
	private UUID id;
	
	private String decryptedName;
	
	private String decryptedDescription;

}

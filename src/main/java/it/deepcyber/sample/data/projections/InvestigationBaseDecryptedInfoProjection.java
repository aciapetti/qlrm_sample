package it.deepcyber.sample.data.projections;

import java.io.Serializable;

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
	
	private static final long serialVersionUID = 2878453596560872059L;

	private String id;
	
	private String decryptedName;
	
	private String decryptedDescription;

}

package it.deepcyber.sample.data.queries;

public class SampleNativeQueries {
	
	public static final String SELECT_ALL_BASE_INVESTIGATIONS_INFO_DECRYPTED = 
		"select id, pgp_sym_decrypt(name, '%s') as decryptedName, pgp_sym_decrypt(description, '%s') as decryptedDescription from investigations";

}

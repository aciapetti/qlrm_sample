select 
	id, 
	pgp_sym_decrypt(name, 'very secure encryption key!') as decrypted_name, 
	pgp_sym_decrypt(description, 'very secure encryption key!') as decrypted_description 
from public.investigations;

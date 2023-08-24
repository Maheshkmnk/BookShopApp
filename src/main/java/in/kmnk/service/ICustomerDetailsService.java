package in.kmnk.service;

import org.springframework.http.ResponseEntity;

import in.kmnk.dto.CustomerDetails;

public interface ICustomerDetailsService {

	public ResponseEntity<?> createUser(CustomerDetails userDetails);
	
	public ResponseEntity<?> validateUser(String uemail, String upassword);

	public ResponseEntity<?> getUserDetailsByEmail(String uemail);
	
}

package in.kmnkpackage.service;

import in.kmnkpackage.dto.CustomerDetails;

public interface ICustomerDetailsService {

	public String createUser();
	
	public Boolean validateUser(String uemail, String upassword);

	public CustomerDetails getUserDetailsByEmail(String uemail);
	
}

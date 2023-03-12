package in.kmnkpackage.dao;

import in.kmnkpackage.dto.CustomerDetails;

public interface ICustomerDetailsDao {

	public String createUser();
	
	public Boolean validateUser(String uemail, String upassword);

	public CustomerDetails getUserDetailsByEmail(String uemail);
	
}

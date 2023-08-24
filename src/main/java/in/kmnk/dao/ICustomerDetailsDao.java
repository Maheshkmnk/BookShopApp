package in.kmnk.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.kmnk.dto.CustomerDetails;

public interface ICustomerDetailsDao extends JpaRepository<CustomerDetails, Long> {

	@Query("SELECT u.upassword FROM CustomerDetails u WHERE u.uemail=:uemail")
	public String getUserPasswordByEmail(String uemail);
	
	@Query("SELECT u FROM CustomerDetails u WHERE u.uemail=:uemail")
	public CustomerDetails getUserDetailsByEmail(String uemail);

}
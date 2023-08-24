package in.kmnk.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.kmnk.dto.Address;

public interface IAddressDao extends JpaRepository<Address, Long> {

//	@Query("SELECT c FROM CustomerDetails c WHERE c.uemail=:uemail")
//	public Address getUserAddressesByEmail(String uemail);

}
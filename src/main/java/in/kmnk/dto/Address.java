package in.kmnk.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long aid;
	
	private String name;
	private String email;
	private String alternatemobile;
	private String doornumberandstreet;
	private Integer pincode;
	private String locality;
	private String cityordistrictortown;
	private String state;
	private String landmark;
	private String typeaddress;
	
}

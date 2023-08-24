package in.kmnk.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CustomerDetails2 implements Serializable {

	private static final long serialVersionUID = -2306041223511801470L;

	
	private String username;
	private String email;
	private String phone;
	private String password;
	

}

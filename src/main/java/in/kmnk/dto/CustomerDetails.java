package in.kmnk.dto;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class CustomerDetails implements Serializable {

	private static final long serialVersionUID = -2306041223511801470L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long uid;
	private String uname;
	private String uemail;
	private String umobile;
	private String upassword;
	private String ugender;
	private Integer uage;
	private LocalDateTime uregistereddate;
	
	@OneToMany
	@JoinColumn(name = "uid")
	private List<Address> address;

}

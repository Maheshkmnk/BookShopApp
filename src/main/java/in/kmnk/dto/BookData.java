package in.kmnk.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class BookData implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long bid;
	private String bname;
	private String bgenres;
	private String bookWriterName;
	private String language;
	private Double price;
	
	@CreationTimestamp
	private LocalDateTime posteddate;
	private String uemail;
	

}

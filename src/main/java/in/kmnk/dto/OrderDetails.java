package in.kmnk.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class OrderDetails implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long oTransactionId;
	private LocalDateTime ordereddate;
	private Long uid;
	private Long bid;
	
}

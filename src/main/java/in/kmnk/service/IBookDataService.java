package in.kmnk.service;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;

import in.kmnk.dto.BookData;

public interface IBookDataService {

	public ResponseEntity<?> searchProductById(Long bid);

	public ResponseEntity<?> createProduct(String bname, String bgeneres, String bookWriterName, String Language,
			LocalDateTime posteddate, String uemail);

	public ResponseEntity<?> updateProduct(BookData bookData);

	public ResponseEntity<?> deleteProductById(Long bid);

	public ResponseEntity<?> getAllProducts();


}

package in.kmnk.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import in.kmnk.dao.IBookDataDao;
import in.kmnk.dto.BookData;
import in.kmnk.globalException.CustomException;

@Service
public class BookDataServiceImpl implements IBookDataService {

	@Autowired
	IBookDataDao bookDataDao;

	@Override
	public ResponseEntity<?> searchProductById(Long bid) {

		if (bookDataDao != null) {
			 BookData findById = bookDataDao.findById(bid).orElseThrow(()-> new CustomException("With this id" +bid+ "no product found"));
			if ( findById != null) {
				return new ResponseEntity<>(findById, HttpStatus.OK);
			}
		}
		return null;
	}

	@Override
	public ResponseEntity<?> createProduct(String bname, String bgeneres, String bookWriterName, String Language,
			LocalDateTime posteddate, String uemail) {

		BookData bookData = new BookData();
		bookData.setBname(bname);
		bookData.setBgenres(bgeneres);
		bookData.setBookWriterName(bookWriterName);
		bookData.setLanguage(Language);
		bookData.setPosteddate(posteddate);
		bookData.setUemail(uemail);
		if (bookData != null) {
			BookData save = bookDataDao.save(bookData);
			if (save != null) {
				return new ResponseEntity<>("Successfull", HttpStatus.OK);
			}
		}
		return new ResponseEntity<>("Fail", HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<?> updateProduct(BookData bookData) {

		if (bookDataDao != null) {
			BookData save = bookDataDao.save(bookData);
			if (save != null) {
				return new ResponseEntity<>("Details updated successfully", HttpStatus.OK);
			}
		}
		return new ResponseEntity<>("Failed to update", HttpStatus.NOT_FOUND);
	}

	@Override
	public ResponseEntity<?> deleteProductById(Long bid) {
		BookData res = bookDataDao.findById(bid).orElseThrow(()-> new CustomException("Book with given id "+bid+" not found"));
		if (bookDataDao != null) {
			if (res != null) {
				bookDataDao.deleteById(bid);
				return new ResponseEntity<>("Success", HttpStatus.OK);
			}
		}
		return null;
	}

	@Override
	public ResponseEntity<?> getAllProducts() {
		System.out.println("Service >> getAllProducts");
		if (bookDataDao != null) {
			System.out.println("Service >> getAllProducts");
			List<BookData> allProducts = bookDataDao.findAll();
			if (!allProducts.isEmpty()) {
				System.out.println("Service >> isEmpty checking");
				return new ResponseEntity<>(allProducts, HttpStatus.OK);
			}
		}
		return new ResponseEntity<>("No records found", HttpStatus.NOT_FOUND);
	}

}

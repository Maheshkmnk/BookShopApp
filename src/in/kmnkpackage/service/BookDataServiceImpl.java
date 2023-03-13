package in.kmnkpackage.service;

import in.kmnkpackage.dao.BookDataDaoImpl;
import in.kmnkpackage.dao.IBookDataDao;
import in.kmnkpackage.dto.BookData;

public class BookDataServiceImpl implements IBookDataService {
	IBookDataDao bookDataDao = null;
	
	@Override
	public BookData searchById(Integer bid) {
		bookDataDao = new BookDataDaoImpl();
		if(bookDataDao != null)
			return bookDataDao.searchById(bid);
		return null;
	}

	@Override
	public String createProduct(String bname, String bgeneres, String bookWriterName, String Language) {
		bookDataDao = new BookDataDaoImpl();
		if(bookDataDao != null)
			return bookDataDao.createProduct(bname, bgeneres, bookWriterName, Language);
		
		return null;
	}

	@Override
	public String updateProduct(BookData bookData) {
		bookDataDao = new BookDataDaoImpl();
		if(bookDataDao != null)
			return bookDataDao.updateProduct(bookData);
		return null;
	}

	@Override
	public String deleteProductById(Integer bid) {
		bookDataDao = new BookDataDaoImpl();
		if(bookDataDao != null)
			return bookDataDao.deleteProductById(bid);
		return null;
	}

	@Override
	public BookData loadProducts() {
		bookDataDao = new BookDataDaoImpl();
		if(bookDataDao != null)
			return bookDataDao.loadProducts();
		return null;
	}

}

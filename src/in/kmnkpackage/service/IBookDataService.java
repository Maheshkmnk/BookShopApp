package in.kmnkpackage.service;

import in.kmnkpackage.dto.BookData;

public interface IBookDataService {
	
	public BookData searchById(Integer bid);

	public String createProduct(String bname, String bgeneres, String bookWriterName, String Language);
	
	public String updateProduct(BookData bookData);
	
	public String deleteProductById(Integer bid);
	
	public BookData loadProducts();
	
}

package in.kmnkpackage.dao;

import in.kmnkpackage.dto.BookData;

public interface IBookDataDao {

	public BookData searchById(Integer bid);

	public String createProduct(String bname, String bgeneres, String bookWriterName, String Language);
	
	public String updateProduct(BookData bookData);
	
	public String deleteProductById();
	
	public BookData loadProducts();
	
}

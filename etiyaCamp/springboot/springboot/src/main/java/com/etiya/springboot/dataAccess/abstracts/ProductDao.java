package com.etiya.springboot.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.etiya.springboot.entities.concretes.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
	// list olmadan sorgulama yaptığımızda limit 1 yani 1 tane değer getiriyor.

	// getBy || findBy ikisi de kullanılabilir.
	// reflection
	List<Product> getByProductName(String productName);
	// yukarıdaki sorgunun sql dilindeki karşılığı
	// select * from products where productName= @productName

	// ürünler için category listelerken categorydeki categoryIdye bağlarız.
	// yazım şeklide aşağıdaki gibi _categoryId gibi
	List<Product> getByCategory_CategoryId(int categoryId);

	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

	List<Product> getByCategory_CategoryIdIn(List<Integer> categories);

	List<Product> getByProductNameContains(String productName);
	
	boolean existsProductByProductName(String productName);
	
	int countByCategory_CategoryId(int categoryId);

	List<Product> getByProductNameStartsWith(String productName);

	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);

	/*
	 * @Query("Select new com.etiya.springboot.entities.dtos.ProductDetailDto" +
	 * "(p.id, p.productName, c.categoryName) " +
	 * "From Category c Inner Join c.products p") List<ProductDetailDto>
	 * getProductWithCategoryDetails();
	 */

	// select p.productId,p.productName, c.categoryName from Category c inner join
	// Product p
	// on c.categoryId = p.categoryId
	 
	 
	 
	
	
	
	
	
}

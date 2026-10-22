package Model.dao;

import java.util.List;

import Model.entities.Seller;

public interface SellerDao {
	
	void insert (Seller obj) ;
	void update (Seller obj) ;
	void deleteById (Integer Id) ;
	Seller findById (Integer id) ;
	List <Seller> findAll() ;

}

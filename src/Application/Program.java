package Application;

import Model.dao.DaoFactory;
import Model.dao.SellerDao;
import Model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		Seller seller = sellerDao.findById(2);
				
		System.out.println(seller);
		
	}

}

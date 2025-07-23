package application;



import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entites.Department;
import model.entites.Seller;

import java.util.Date;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("Test1: seller findById");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);

		System.out.println("Test2: seller findByDepartment");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller seller1 : list){
			System.out.println(seller1);
		}

		System.out.println("Test3: seller findAll");
		Department department1 = new Department(2,null);
		list = sellerDao.findAll();
		for (Seller seller1 : list){
			System.out.println(seller1);
		}

		System.out.println("Test4: seller Insert");
		Seller seller1 = new Seller(null,"grog","Grog@gmail.com",new Date(),2020.0,department);
		sellerDao.insert(seller1);
		System.out.println("Inserted! new id = "+ seller1.getId());

		System.out.println("Test5: seller update");
		Seller selle = sellerDao.findById(1);
		selle.setName("Martha waine");
		sellerDao.update(selle);
	}
}

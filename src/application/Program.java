package application;

import java.util.Date;
import model.entites.Seller;

public class Program {

	public static void main(String[] args) {
		Seller seller = new Seller(1,"sandy", "sandy@gmail.com",new Date(),200.0);
		System.out.println(seller);
	}
}

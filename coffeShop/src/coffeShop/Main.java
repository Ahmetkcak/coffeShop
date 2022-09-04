package coffeShop;

import Abstracts.BaseCustomerManager;
import Adaptors.MernisServiceAdapter;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Customer customer1 = new Customer (1 , "Ahmet" , "Koçak", 2002, "1111111111" );

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());

		customerManager.save(customer1);
		System.out.println();
	}

}

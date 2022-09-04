package Abstracts;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Save to db : " + customer.getFirstName());
		
	}

}

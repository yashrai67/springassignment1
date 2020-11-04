package Customer.springbootrestjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Customer.springbootrestjpa.dao.ICustomerRepository;
import Customer.springbootrestjpa.entities.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private ICustomerRepository daoCustomer;

	@Override
	public Customer register(Customer customer) {
		Customer registeredCustomer = daoCustomer.save(customer);
		return registeredCustomer;
	}

	@Override
	public Customer update(Customer customer) {
		Customer updatedCustomer = daoCustomer.save(customer);
		return updatedCustomer;
	}

	@Override
	public List<Customer> findAll() {
		//TypeCast
		List<Customer> customers = (List<Customer>) daoCustomer.findAll(); 
		return customers;
	}

}

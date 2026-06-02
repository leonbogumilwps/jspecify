package wps.lbo.jspecify.customer.service;

import org.springframework.stereotype.Service;
import wps.lbo.jspecify.customer.entity.Customer;

@Service
public class CustomerService
{

	public Customer getCustomer(Long id)
	{
		return new Customer(id, null, "premium");
	}

}

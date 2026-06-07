package wps.lbo.jspecify.customer.service;

import wps.lbo.jspecify.customer.entity.Customer;

import java.util.ArrayList;
import java.util.List;

/// Beispiele für die Nutzung von JSpecify
@SuppressWarnings("unused")
public class CustomerServiceJSpecify
{
	
	public Customer getCustomer(Long id)
	{
		return null;
	}

	// JSpecify unterstützt Generics
	public List<Customer> getCustomers()
	{
		var result = new ArrayList<Customer>();
		result.add(null);
		return result;
	}

	public List<Customer> getCustomers2()
	{
		return null;
	}

	// JSpecify auf Arrays Teil 1
	public Customer[] getCustomersArray()
	{
		return new Customer[] { null };
	}

	// JSpecify auf Arrays Teil 2
	public Customer[] getCustomersArray2()
	{
		return null;
	}

}

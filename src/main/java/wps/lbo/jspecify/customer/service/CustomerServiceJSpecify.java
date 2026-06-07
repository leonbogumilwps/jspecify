package wps.lbo.jspecify.customer.service;

import wps.lbo.jspecify.customer.entity.Customer;
import wps.lbo.jspecify.customer.entity.CustomerList;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/// Beispiele für die Nutzung von JSpecify
//@NullMarked
@SuppressWarnings("unused")
public class CustomerServiceJSpecify
{

	// 1. Simpel -----------------------
	// @NullUnmarked
	public Customer getCustomer(Long id)
	{
		return null;
	}

	private void printCustomer()
	{
		// Lokale Variable kann nicht annotiert werden
		Customer customer = getCustomer(null);
		IO.println(customer.name());
	}

	// 2. Generics -----------------------

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

	// 3. Arrays -----------------------

	public Customer[] getCustomersArray()
	{
		return new Customer[] { null };
	}

	public Customer[] getCustomersArray2()
	{
		return null;
	}

	// 4. Subtypen -----------------------

	public Map.Entry<Long, Customer> getCustomerEntry()
	{
		return null;
	}

	// 5. Verschachtelte Generics -----------------------

	public List<List<List<Customer>>> getCustomersVerschachtelt()
	{
		List<Customer> innerList = new ArrayList<>();
		innerList.add(null);
		List<List<Customer>> middleList = new ArrayList<>();
		middleList.add(innerList);
		List<List<List<Customer>>> outerList = new ArrayList<>();
		outerList.add(middleList);
		return outerList;
	}

	// 6. Generics Deep-Dive

	public CustomerList<Customer> getCustomerList()
	{
		CustomerList<Customer> customerList = new CustomerList<>();
		//CustomerList<@Nullable Customer> customerList = new CustomerList<>();
		customerList.add(null);
		Customer customer = customerList.getFirst();
		IO.println(customer.name());
		return customerList;
	}

}

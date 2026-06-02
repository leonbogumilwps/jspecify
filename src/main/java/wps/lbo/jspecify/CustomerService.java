package wps.lbo.jspecify;

import org.springframework.stereotype.Service;

@Service
public class CustomerService
{

	public Customer getCustomer(Long id)
	{
		return new Customer(id, null, "premium");
	}

	public record Customer(Long id, String name, String status)
	{

	}

}

package wps.lbo.jspecify.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import wps.lbo.jspecify.customer.service.CustomerService;

@Controller
public class IndexController
{

	private final CustomerService customerService;

	public IndexController(CustomerService customerService)
	{
		this.customerService = customerService;
	}

	@GetMapping("/")
	public String index()
	{
		return "index";
	}

	@GetMapping("/load-customer")
	public String loadCustomer()
	{
		return customerService.getCustomer(1L).name().toUpperCase();
	}

}

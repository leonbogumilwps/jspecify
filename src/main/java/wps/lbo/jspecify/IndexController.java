package wps.lbo.jspecify;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
	public String triggerError()
	{
		return customerService.getCustomer(1L).name().toUpperCase();
	}

}

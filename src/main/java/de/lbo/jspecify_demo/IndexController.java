package de.lbo.jspecify_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController
{

	@GetMapping("/")
	public String index()
	{
		return "index";
	}

	@GetMapping("/trigger-error")
	public String triggerError()
	{
		throw new RuntimeException("Test Exception");
	}

}

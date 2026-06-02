package wps.lbo.jspecify.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import wps.lbo.jspecify.customer.service.CustomerService;

import static org.hamcrest.Matchers.startsWith;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(IndexController.class)
@Import({ ExceptionHandlerAdvice.class, CustomerService.class })
class ExceptionHandlerAdviceTest
{

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testHandleError() throws Exception
	{
		mockMvc.perform(get("/load-customer"))
				.andExpect(status().isOk())
				.andExpect(view().name("500"))
				.andExpect(model().attributeExists("catImage"))
				.andExpect(model().attribute("catImage", startsWith("/images/sad-cat-")));
	}

}

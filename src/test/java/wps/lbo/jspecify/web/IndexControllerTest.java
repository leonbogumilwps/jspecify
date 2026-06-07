package wps.lbo.jspecify.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.web.servlet.MockMvc;
import wps.lbo.jspecify.customer.service.CustomerService;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(IndexController.class)
@Import(CustomerService.class)
class IndexControllerTest
{

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testIndex() throws Exception
	{
		mockMvc.perform(get("/"))
				.andExpect(status().isOk())
				.andExpect(view().name("index"))
				.andExpect(content().string(containsString("Hello World")));
	}

	@Test
	void testTriggerErrorCausesNpe() throws Exception
	{
		mockMvc.perform(get("/load-customer"))
				.andExpect(status().isInternalServerError())
				.andExpect(view().name("500"));
	}

}

package de.lbo.jspecify_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest
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

}

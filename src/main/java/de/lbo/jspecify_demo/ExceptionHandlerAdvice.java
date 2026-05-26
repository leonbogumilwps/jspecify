package de.lbo.jspecify_demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Random;

@ControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler
{

	private final Random random = new Random();

	@ExceptionHandler(Exception.class)
	public String handleError(HttpServletRequest request, Model model)
	{
		int catNumber = random.nextInt(3) + 1;
		model.addAttribute("catImage", "/images/sad-cat-" + catNumber + ".jpeg");
		return "500";
	}

}

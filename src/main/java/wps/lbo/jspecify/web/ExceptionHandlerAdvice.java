package wps.lbo.jspecify.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler
{
	private int currentCatNumber = 0;

	@ExceptionHandler(Exception.class)
	public String handleError(Model model)
	{
		model.addAttribute("catImage", "/images/sad-cat-" + currentCatNumber + ".jpeg");
		currentCatNumber = (currentCatNumber + 1) % 3;
		return "500";
	}

}

package wps.lbo.jspecify.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice extends ResponseEntityExceptionHandler
{
	private static final Logger logger = LoggerFactory.getLogger(ExceptionHandlerAdvice.class);
	private int currentCatNumber = 0;

	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public String handleError(Model model, Exception ex)
	{
		logger.error("Error ", ex);
		model.addAttribute("catImage", "/images/sad-cat-" + currentCatNumber + ".jpeg");
		currentCatNumber = (currentCatNumber + 1) % 3;
		return "500";
	}

}

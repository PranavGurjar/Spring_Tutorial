package spring_search;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
//	handling exception in our spring mvc
	
//	@ExceptionHandler({NullPointerException.class, NumberFormatException.class})
//	public String exceptionHandlerNull() {
//		return "null_page";
//	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg", "Null Pointer Exception has occured!");
		return "null_page";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m) {
		m.addAttribute("msg", "Number Format Exception has occured");
		return "null_page";
	}
	
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandlerGeneric(Model m) {
		m.addAttribute("msg", "Exception has occured");
		return "null_page";
	}
}

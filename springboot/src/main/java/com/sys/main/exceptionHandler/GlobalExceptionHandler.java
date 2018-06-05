package com.sys.main.exceptionHandler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 处理异常
 * @author Administrator
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value = Exception.class)
	public ModelAndView defultHandler(HttpServletRequest request,Exception e) throws Exception{
		ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url", request.getRequestURL());
        mav.setViewName("errorPage");
		return mav;
	}

}

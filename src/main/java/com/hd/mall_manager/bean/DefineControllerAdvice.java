package com.hd.mall_manager.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@ControllerAdvice
public class DefineControllerAdvice {
	Logger logger = LoggerFactory.getLogger(DefineControllerAdvice.class);

	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Map<String, Object> errorHandler(Exception ex) {
		Map<String, Object> map = Constant.BaseResultMap(null);
		map.put("code", 1);
		map.put("msg", ex.toString());
		logger.error("未捕获的异常", ex);
		return map;
	}

	/**
	 * 拦截捕捉自定义异常 MyException.class
	 * @param ex
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value = DefineException.class)
	public Map<String, Object> myErrorHandler(DefineException ex) {
		Map<String, Object> map = Constant.BaseResultMap(null);
		map.put("code", ex.getCode());
		map.put("msg", ex.getMsg());
		return map;
	}

}

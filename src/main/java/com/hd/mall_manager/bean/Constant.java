package com.hd.mall_manager.bean;

import java.util.HashMap;
import java.util.Map;

public class Constant {

	public static final String SESSION_ACCOUNT_KEY = "user";
	public static final String SESSION_ACCOUNT_ID_KEY = "userId";
	public static String[] noFilters = null;
	public static boolean openPassAuth = false;

	/**
	 * 基础返回模板
	 * @param target
	 * @return
	 */
	public static Map<String, Object> BaseResultMap(Object target) {
		Map<String, Object> map = new HashMap<>();
		map.put("target", target);
		map.put("code", 0);
		map.put("msg", null);
		return map;
	}

}

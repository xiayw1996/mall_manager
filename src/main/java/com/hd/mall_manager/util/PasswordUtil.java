package com.hd.mall_manager.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

public class PasswordUtil {
	public static String OWN_SALT = "夏_扬_威";

	//密码加密
	public static String encryptPassword(String password) {
		return new SimpleHash("md5", password, ByteSource.Util.bytes(password + OWN_SALT), 25).toHex();
	}

	//用户名和密码加密
	public static String encryptNameAndPwd(String username, String password) {
		String userNamePwd = username + password;
		return encryptPassword(userNamePwd);
	}

	public static void main(String[] args) {
		System.out.println(encryptPassword("111111"));
	}

}

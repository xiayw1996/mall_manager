package com.hd.mall_manager;

import com.hd.mall_manager.bean.Constant;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.hd.mall_manager.dao")
@EnableTransactionManagement
public class MallManagerApplication {

	public static void main(String[] args) {
		//这个用来检测是否校验token的，false 就是要检验，true就是不校验
		Constant.openPassAuth = false;
		SpringApplication.run(MallManagerApplication.class, args);
	}

}

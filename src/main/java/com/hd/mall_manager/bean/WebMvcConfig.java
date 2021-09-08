package com.hd.mall_manager.bean;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author xiayw
 * @date 2020年8月20日
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOriginPatterns("*").allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
				.maxAge(3600).allowCredentials(true);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//注册TestInterceptor拦截器
		InterceptorRegistration registration = registry.addInterceptor(new InterceptorConfig());
		registration.addPathPatterns("/**");                      //所有路径都被拦截
		registration.excludePathPatterns(                         //添加不拦截路径
				"/login.html",            //登录
				"/login",
				"/logout",
				"/",
				"/sim/photo/*",
				"/**/*.html",            //html静态资源
				"/**/*.js",              //js静态资源
				"/**/*.css",             //css静态资源
				"/**/*.woff",
				"/**/*.ttf",
				"/images/*",
				"/img/*",
				"/**/*.ico",
				"/**/*.map"
		);
	}

}

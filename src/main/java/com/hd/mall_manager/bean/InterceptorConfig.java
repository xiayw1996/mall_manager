package com.hd.mall_manager.bean;

import com.hd.mall_manager.util.TokenUtil;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InterceptorConfig implements HandlerInterceptor {
    //在请求处理之前进行调用（Controller方法调用之前）
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if(Constant.openPassAuth){
            //配置如果是不需要登录验证的话，就不启动拦截
            return true;
        }
        //统一拦截
        if(request == null){
            return false;
        }
        //如果是OPTIONS请求，就放行
        if(HttpMethod.OPTIONS.toString().equals(request.getMethod())){
            return true;
        }
        //如果是错误的请求，就放行
        if("/error".equals(request.getRequestURI())) {
            return true;
        }
        //校验token是不是为空
        String token = request.getHeader("Authorization");
        if(token == null || token.equals("")){
            //return false;
            throw ResultCode.tokenException.getDE();
        }
        //如果token不为空，就校验是否过期
        boolean result = TokenUtil.verify(token);
        if (!result) {
            throw ResultCode.tokenException.getDE();
        }
        return true;
    }

    //请求处理之后进行调用，但是在视图被渲染之前（Controller方法调用之后）
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
    }

    //在整个请求结束之后被调用，也就是在DispatcherServlet 渲染了对应的视图之后执行（主要是用于进行资源清理工作）
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
    }
}

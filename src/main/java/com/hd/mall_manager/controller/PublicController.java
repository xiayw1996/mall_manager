package com.hd.mall_manager.controller;

import com.alibaba.fastjson.JSONObject;
import com.hd.mall_manager.bean.ResultCode;
import com.hd.mall_manager.bean.ResultVO;
import com.hd.mall_manager.entity.SpManager;
import com.hd.mall_manager.entity.SpUser;
import com.hd.mall_manager.service.SpManagerService;
import com.hd.mall_manager.util.PasswordUtil;
import com.hd.mall_manager.util.TokenUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author xiayw
 * @date 2020/7/13 0:39
 */
@Controller
public class PublicController {

    @Resource
    private SpManagerService spManagerService;

    @RequestMapping("/login")
    @ResponseBody
    public ResultVO login(@RequestBody SpUser userForm){
        String username = userForm.getUsername();
        String password = userForm.getPassword();
        //判断用户名和密码是否为空
        if(StringUtils.isBlank(username) || StringUtils.isBlank(password)){
            return new ResultVO(ResultCode.paramNullException);
        }

        //判断用户名是否存在
        SpManager user1 = spManagerService.queryByUserNameAndPwd(username,null);
        if(user1 == null){
            return new ResultVO(ResultCode.accountDoesNotExistException);
        }

        //密码加密
        password = PasswordUtil.encryptPassword(password);

        //判断用户名和密码是否正确
        SpManager user2 = spManagerService.queryByUserNameAndPwd(username, password);
        if(user2 == null){
            return new ResultVO(ResultCode.usernameOrPwdException);
        }

        //判断如果用户被禁用，就不允许登录
        if (!user2.getMgState()) {
            return new ResultVO(ResultCode.accountBlockingException);
        }

        JSONObject jo = new JSONObject();
        jo.put("id",user2.getMgId());
        jo.put("rid",user2.getRoleId());
        jo.put("username",user2.getMgName());
        jo.put("mobile",user2.getMgMobile());
        jo.put("email",user2.getMgEmail());
        jo.put("token", TokenUtil.token(username,password));
        return new ResultVO(jo);
    }

    @RequestMapping("/")
    public String login1(){
        return "redirect:index.html";
    }

    /*@RequestMapping("/logout")
    @ResponseBody
    public ResultVO logout(HttpSession session){
        session.removeAttribute(Constant.SESSION_ACCOUNT_KEY);
        session.invalidate();
        return new ResultVO();
    }

    @RequestMapping("/user/info")
    @ResponseBody
    public ResultVO userInfo(HttpSession session){
        if(Constant.openPassAuth){
            SpManager user = new SpManager();
            user.setMgId(500);
            user.setMgName("admin");
            return new ResultVO(user);
        }
        return new ResultVO(session.getAttribute(Constant.SESSION_ACCOUNT_KEY));
    }*/

}

package com.yyyu.crm.controller;

import com.yyyu.crm.biz.SysUserBiz;
import com.yyyu.crm.pojo.LoginVo;
import com.yyyu.crm.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * 功能：登录控制器
 *
 * @author yu
 * @date 2017/7/17.
 */

@Controller
public class LoginController {

    @Autowired
    private SysUserBiz sysUserBiz;

    @RequestMapping("user/getUserInfo.action")
    public @ResponseBody SysUser getSysUserByUserId(long userId){

        return sysUserBiz.getSysUserByUserId(userId);
    }

    /**
     * 验证用户登录
     *
     * @param userName
     * @param userPassword
     * @return
     */
    @RequestMapping(value = {"user/checkUser.action" } , method = RequestMethod.POST)
    public String checkUser(String userName , String userPassword  , HttpSession session){
        System.out.println("userName=="+userName);
        String result ;
        LoginVo loginVo = new LoginVo();
        loginVo.setUserName(userName);
        loginVo.setUserPassword(userPassword);
        SysUser user = sysUserBiz.checkLogin(loginVo);
        if(user !=null){
            result =  "redirect:/customer/list.action";
            session.setAttribute("userInfo" , user);
        }else{
            result =  "login";
        }

        return result;
    }

}

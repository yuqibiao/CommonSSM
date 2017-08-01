package com.yyyu;

import com.yyyu.pojo.LoginVo;
import com.yyyu.pojo.SysUser;

/**
 * 功能：用户表相关的业务操作接口
 *
 * @author yu
 * @date 2017/7/17.
 */
public interface SysUserBiz {

    SysUser getSysUserByUserId(long userId);

    SysUser checkLogin(LoginVo loginVo);

}

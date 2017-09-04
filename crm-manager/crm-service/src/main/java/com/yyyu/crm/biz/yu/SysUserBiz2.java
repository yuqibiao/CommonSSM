package com.yyyu.crm.biz.yu;

import com.yyyu.crm.pojo.LoginVo;
import com.yyyu.crm.pojo.SysUser;
import com.yyyu.crm.pojo2.SysUser2;

/**
 * 功能：用户表相关的业务操作接口
 *
 * @author yu
 * @date 2017/7/17.
 */
public interface SysUserBiz2 {

    SysUser2 getSysUserByUserId(long userId);

}

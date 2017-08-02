package com.yyyu.crm.dao;


import com.yyyu.crm.pojo.LoginVo;
import com.yyyu.crm.pojo.SysUser;

public interface SysUserMapper {

    /**
     * 根据id得到用户信息
     *
     * @param userId
     * @return
     */
    SysUser getSysUserByUserId(long userId);

    /**
     * 用户登录验证
     *
     * @param loginVo
     * @return
     */
     SysUser getSysUserByLoginVo(LoginVo loginVo);

}
package com.yyyu.dao;


import com.yyyu.pojo.LoginVo;
import com.yyyu.pojo.SysUser;

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
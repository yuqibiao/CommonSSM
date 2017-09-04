package com.yyyu.crm.yu;


import com.yyyu.crm.pojo2.SysUser2;

public interface SysUserMapper2 {

    /**
     * 根据id得到用户信息
     *
     * @param userId
     * @return
     */
    SysUser2 getSysUserByUserId(long userId);


}
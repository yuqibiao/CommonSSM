package com.yyyu.crm.biz;

import com.yyyu.crm.dao.SysUserMapper;
import com.yyyu.crm.pojo.LoginVo;
import com.yyyu.crm.pojo.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能：用户表相关的业务操作接口实现
 *
 * @author yu
 * @date 2017/7/17.
 */
@Service("sysUserBiz")
public class SysUserBizImpl implements SysUserBiz {

    @Autowired
    SysUserMapper sysUserMapper;

    @Override
    public SysUser getSysUserByUserId(long userId) {
        return sysUserMapper.getSysUserByUserId(userId);
    }

    @Override
    public SysUser checkLogin(LoginVo loginVo) {

        return sysUserMapper.getSysUserByLoginVo(loginVo);
    }
}

package com.yyyu.crm.biz.yu;

import com.yyyu.crm.pojo2.SysUser2;
import com.yyyu.crm.yu.SysUserMapper2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能：用户表相关的业务操作接口实现
 *
 * @author yu
 * @date 2017/7/17.
 */
@Service()
public class SysUserBizImpl2 implements SysUserBiz2 {

    @Autowired
    SysUserMapper2 sysUserMapper;

    @Override
    public SysUser2 getSysUserByUserId(long userId) {
        return sysUserMapper.getSysUserByUserId(userId);
    }
}

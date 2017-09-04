package com.yyyu.crm;

import com.yyyu.crm.biz.SysUserBiz;
import com.yyyu.crm.biz.yu.SysUserBiz2;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/8/2.
 */
public class TestSysUserBiz extends BaseTest{

    private Logger logger;

    @Autowired
    private SysUserBiz sysUserBiz1;

    @Autowired
    private SysUserBiz2 sysUserBiz2;

    @Override
    public void initTest() {
        logger = Logger.getLogger(TestSysUserBiz.class);
    }

    @Test
    public void testGetSysUserByUserId1(){
        sysUserBiz1.getSysUserByUserId(5L);
    }

    @Test
    public void testGetSysUserByUserId2(){
        sysUserBiz2.getSysUserByUserId(1L);
    }


}

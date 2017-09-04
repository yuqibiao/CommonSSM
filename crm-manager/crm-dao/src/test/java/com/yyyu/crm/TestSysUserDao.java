package com.yyyu.crm;

import com.yyyu.crm.dao.SysUserMapper;
import com.yyyu.crm.yu.SysUserMapper2;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/8/1.
 */
public class TestSysUserDao extends BaseTest{

    Logger logger = Logger.getLogger(TestSysUserDao.class);

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private SysUserMapper2 sysUserMapper2;

    @Override
    public void initTest() {
        logger.info("============记录dao测试日志=======");
    }

    @Test
    public void testetSysUserByUserId(){
        sysUserMapper.getSysUserByUserId(5l);
    }


    @Test
    public void testetSysUserByUserId2(){
        sysUserMapper2.getSysUserByUserId(1l);
    }

}

package com.yyyu;

import com.yyyu.dao.CustomerMapper;
import com.yyyu.dao.SysUserMapper;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/8/1.
 */
public class TestCustomerDao extends BaseTest{

    Logger logger = Logger.getLogger(TestCustomerDao.class);

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void initTest() {
        logger.info("============记录dao测试日志=======");
    }

    @Test
    public void testAddCustomer(){
        customerMapper.getCustomerByCustId(15l);
    }

}

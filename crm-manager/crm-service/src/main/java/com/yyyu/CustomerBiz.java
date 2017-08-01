package com.yyyu;

import com.yyyu.pojo.Customer;
import com.yyyu.pojo.CustomerQueryVo;
import com.yyyu.utils.page.Page;

import java.util.List;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/18.
 */
public interface CustomerBiz {

    void deleteCustomerByCustId(long custId);

    Customer getCustomerByCustId(long custId);

    List<Customer> getCustomersByQueryVo(CustomerQueryVo queryVo);

    Page<Customer> getPageByQueryVo(CustomerQueryVo queryVo);

    void modifyCustomerByCustId(Customer customer);

}

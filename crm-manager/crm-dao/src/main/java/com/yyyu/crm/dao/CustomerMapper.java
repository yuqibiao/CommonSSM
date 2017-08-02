package com.yyyu.crm.dao;


import com.yyyu.crm.pojo.Customer;
import com.yyyu.crm.pojo.CustomerQueryVo;

import java.util.List;

public interface CustomerMapper {

    void deleteCustomerByCustId(long custId);

    Customer getCustomerByCustId(long custId);

    Integer getCustomerTotal(CustomerQueryVo customerQueryVo);

    List<Customer>  getCustomersByQueryVo(CustomerQueryVo queryVo);

    void modifyCustomerByCustId(Customer customer);

}
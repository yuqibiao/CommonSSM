package com.yyyu.dao;


import com.yyyu.pojo.Customer;
import com.yyyu.pojo.CustomerQueryVo;

import java.util.List;

public interface CustomerMapper {

    void deleteCustomerByCustId(long custId);

    Customer getCustomerByCustId(long custId);

    Integer getCustomerTotal(CustomerQueryVo customerQueryVo);

    List<Customer>  getCustomersByQueryVo(CustomerQueryVo queryVo);

    void modifyCustomerByCustId(Customer customer);

}
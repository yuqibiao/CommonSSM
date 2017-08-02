package com.yyyu.crm.biz;

import com.yyyu.crm.dao.CustomerMapper;
import com.yyyu.crm.pojo.Customer;
import com.yyyu.crm.pojo.CustomerQueryVo;
import com.yyyu.crm.utils.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/18.
 */
@Service
public class CustomerBizImpl implements CustomerBiz{

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void deleteCustomerByCustId(long custId) {
        customerMapper.deleteCustomerByCustId(custId);
    }

    @Override
    public Customer getCustomerByCustId(long custId) {
        return customerMapper.getCustomerByCustId(custId);
    }

    @Override
    public List<Customer> getCustomersByQueryVo(CustomerQueryVo queryVo) {

        return customerMapper.getCustomersByQueryVo(queryVo);
    }

    @Override
    public Page<Customer> getPageByQueryVo(CustomerQueryVo queryVo) {
        Page<Customer> page = new Page<>();
        page.setSize(queryVo.getSize());
        page.setPage(queryVo.getPage());
        page.setTotal(customerMapper.getCustomerTotal(queryVo));
        page.setRows(getCustomersByQueryVo(queryVo));
        return page;
    }

    @Override
    public void modifyCustomerByCustId(Customer customer) {
        customerMapper.modifyCustomerByCustId(customer);
    }
}

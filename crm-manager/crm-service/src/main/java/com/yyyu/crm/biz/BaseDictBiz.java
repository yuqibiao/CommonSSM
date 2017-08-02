package com.yyyu.crm.biz;

import com.yyyu.crm.pojo.BaseDict;

import java.util.List;

/**
 * 功能：数据字典
 *
 * @author yu
 * @date 2017/7/18.
 */
public interface BaseDictBiz {

    List<BaseDict> getBaseDictByTypeCode(String typeCode);

}

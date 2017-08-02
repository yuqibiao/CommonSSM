package com.yyyu.crm.dao;


import com.yyyu.crm.pojo.BaseDict;

import java.util.List;

public interface BaseDictMapper {

    BaseDict selectByPrimaryKey(String dictId);

    List<BaseDict> getBaseDictByTypeCode(String typeCode);

}
package com.yyyu.dao;


import com.yyyu.pojo.BaseDict;

import java.util.List;

public interface BaseDictMapper {

    BaseDict selectByPrimaryKey(String dictId);

    List<BaseDict> getBaseDictByTypeCode(String typeCode);

}
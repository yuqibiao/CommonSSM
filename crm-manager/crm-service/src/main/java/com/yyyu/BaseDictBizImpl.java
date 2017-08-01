package com.yyyu;

import com.yyyu.dao.BaseDictMapper;
import com.yyyu.pojo.BaseDict;
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
public class BaseDictBizImpl implements BaseDictBiz {

    @Autowired
    private BaseDictMapper baseDictMapper;

    @Override
    public List<BaseDict> getBaseDictByTypeCode(String typeCode) {
        return baseDictMapper.getBaseDictByTypeCode(typeCode);
    }
}

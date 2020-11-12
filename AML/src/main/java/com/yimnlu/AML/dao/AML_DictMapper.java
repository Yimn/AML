package com.yimnlu.AML.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AML_DictMapper extends BaseMapper<com.yimnlu.AML.entity.AML_Dict> {
    List<com.yimnlu.AML.entity.AML_Dict> getEnabled();

    List<com.yimnlu.AML.dto.AML_DICT_GROUP> getGROUP();
}

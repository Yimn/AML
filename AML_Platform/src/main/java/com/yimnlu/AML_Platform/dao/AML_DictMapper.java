package com.yimnlu.AML_Platform.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AML_DictMapper extends BaseMapper<com.yimnlu.AML_Platform.entity.AML_Dict> {
    List<com.yimnlu.AML_Platform.entity.AML_Dict> getEnabled();

    List<com.yimnlu.AML_Platform.dto.AML_DICT_GROUP> getGROUP();
}

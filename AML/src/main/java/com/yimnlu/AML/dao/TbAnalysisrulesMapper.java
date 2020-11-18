package com.yimnlu.AML.dao;

import com.yimnlu.AML.entity.TbAnalysisrules;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface TbAnalysisrulesMapper extends BaseMapper<TbAnalysisrules> {
    List<TbAnalysisrules> selectAll(@Param("DEPART_ID")String DEPART_ID);
}

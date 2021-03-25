package com.yimnlu.AML.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yimnlu.AML.entity.AML_ANALYSISRESULT;
import com.yimnlu.AML.entity.AML_Dict;
import com.yimnlu.AML.entity.AmlDTA;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface presentationMapper extends BaseMapper {
    List<AML_ANALYSISRESULT> selectByWorkDate(@Param(value = "WORKDATE") String WORKDATE);
    List<AmlDTA> visualByRuleBw8_12(String rule);
    List<AmlDTA> visualByRule(String rule);
    List<AmlDTA> visualAmount(String WORK_DATE);

}

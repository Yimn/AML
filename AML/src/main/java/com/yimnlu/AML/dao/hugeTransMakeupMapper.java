package com.yimnlu.AML.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yimnlu.AML.dto.ERR_CODE_SET;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface hugeTransMakeupMapper extends BaseMapper {
    List<ERR_CODE_SET> rule_0501(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);

    List<ERR_CODE_SET> rule_0502(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);

    List<ERR_CODE_SET> rule_0503(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);

    List<ERR_CODE_SET> rule_0504(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);
}

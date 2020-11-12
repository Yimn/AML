package com.yimnlu.AML.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yimnlu.AML.dto.ERR_CODE_SET;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface suspectTransMakeupMapper extends BaseMapper {
    List<ERR_CODE_SET> rule_R0001(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);

    List<ERR_CODE_SET> rule_R0002(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);

    List<ERR_CODE_SET> rule_R0003(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);

    List<ERR_CODE_SET> rule_R0004(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);

    List<ERR_CODE_SET> rule_R0005(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);

    List<ERR_CODE_SET> rule_R0006(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);

    List<ERR_CODE_SET> rule_R0007(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);

    List<ERR_CODE_SET> rule_R0008(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);

    List<ERR_CODE_SET> rule_R0009(@Param("DEPARTID") String DEPARTID, @Param("WORKDATE") String WORKDATE);
}

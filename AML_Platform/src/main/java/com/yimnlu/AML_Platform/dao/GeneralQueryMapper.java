package com.yimnlu.AML_Platform.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yimnlu.AML_Platform.dto.SuspectCommonQuery;
import com.yimnlu.AML_Platform.entity.AmlDTA;
import com.yimnlu.AML_Platform.entity.GeneralQuery;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface GeneralQueryMapper extends BaseMapper<GeneralQuery> {
    List<AmlDTA> SuspectCommonQuery();
    List<AmlDTA> SuspectMonthQuery(@Param("WORKDATE") String WORKDATE);
    List<AmlDTA> DTAQuery();
}

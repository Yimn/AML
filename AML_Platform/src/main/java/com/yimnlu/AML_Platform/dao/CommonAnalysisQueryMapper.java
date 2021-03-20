package com.yimnlu.AML_Platform.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yimnlu.AML_Platform.entity.AmlDTA;
import com.yimnlu.AML_Platform.entity.CountryCode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommonAnalysisQueryMapper extends BaseMapper {
    List<CountryCode> SelectCountryCode(String WORK_DATE);

    List<AmlDTA> DESCbyCountry(String TRADE_COUNTRY, String WORK_DATE);
}

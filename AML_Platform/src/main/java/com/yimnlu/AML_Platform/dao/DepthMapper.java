package com.yimnlu.AML_Platform.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yimnlu.AML_Platform.entity.AmlDTA;
import com.yimnlu.AML_Platform.model.SuspectDimensions;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepthMapper extends BaseMapper<SuspectDimensions> {
    List<AmlDTA> DTAQuery(String WORKDATE,String DEPARTID, String REFNO);
    Integer QueryCount(String ACCT_ID,String RULE_CODE, String RULE_CODE2);
//    Integer QueryHighRiskyArea(String ACCT);
//    Integer QuerySTR0001_STR0002(String ACCT);
//    Integer Query1101(String ACCT);
//    Integer Query0501_0503(String ACCT);
//    Integer Query_0006(String ACCT);

}

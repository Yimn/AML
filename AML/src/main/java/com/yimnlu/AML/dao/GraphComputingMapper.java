package com.yimnlu.AML.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.yimnlu.AML.dto.ACCTBaseDetail;
import com.yimnlu.AML.entity.AmlDTA;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GraphComputingMapper extends BaseMapper<ACCTBaseDetail> {
    List<ACCTBaseDetail> d1();

    List<ACCTBaseDetail> d2();

    List<ACCTBaseDetail> d3(String WORK_dATE);

    List<AmlDTA> QueryByAcctID(String ID);
}

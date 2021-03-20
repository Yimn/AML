package com.yimnlu.AML_Platform.service;

import com.baomidou.mybatisplus.service.IService;
import com.yimnlu.AML_Platform.entity.AmlDTA;
import com.yimnlu.AML_Platform.entity.GeneralQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GeneralQueryService extends IService<GeneralQuery> {
    List<AmlDTA> SuspectCommonQuery();

    List<AmlDTA> SuspectMonthQuery(String WORKDATE);

    List<AmlDTA> SuspectListQuery(String WORKDATE, String DEPARTID, String REFNO);

    List<AmlDTA> DTAQuery(@Param("WORKDATE") String WORKDATE, @Param("DEPARTID") String DEPARTID, @Param("DEPARTID") String REFNO);

    List<AmlDTA> Suspect2Ref(@Param("refNo") String refNo);
}

package com.yimnlu.AML_Platform.service;

import com.baomidou.mybatisplus.service.IService;
import com.yimnlu.AML_Platform.entity.AmlDTA;
import com.yimnlu.AML_Platform.entity.GeneralQuery;

import java.util.List;

public interface GeneralQueryService extends IService<GeneralQuery> {
    List<AmlDTA> SuspectCommonQuery();
    List<AmlDTA> SuspectMonthQuery(String WORKDATE);
}

package com.yimnlu.AML_Platform.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yimnlu.AML_Platform.dao.GeneralQueryMapper;
import com.yimnlu.AML_Platform.entity.AmlDTA;
import com.yimnlu.AML_Platform.entity.GeneralQuery;
import com.yimnlu.AML_Platform.service.GeneralQueryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GeneralQueryServiceImpl extends ServiceImpl<GeneralQueryMapper, GeneralQuery> implements GeneralQueryService {
    @Resource
    GeneralQueryMapper generalQueryMapper;


    @Override
    public List<AmlDTA> SuspectCommonQuery() {
        return generalQueryMapper.DTAQuery();
    }

    @Override
    public List<AmlDTA> SuspectMonthQuery(String WORKDATE) {
        return generalQueryMapper.SuspectMonthQuery(WORKDATE);
    }

    @Override
    public List<AmlDTA> SuspectListQuery(String WORKDATE, String DEPARTID, String REFNO) {
        return generalQueryMapper.SuspectListQuery(WORKDATE, DEPARTID, REFNO);
    }

    @Override
    public List<AmlDTA> DTAQuery(String WORKDATE, String DEPARTID, String REFNO) {
        return generalQueryMapper.DTAQuery(WORKDATE, DEPARTID, REFNO);
    }

    @Override
    public List<AmlDTA> Suspect2Ref(String refNo) {
        return generalQueryMapper.Suspect2Ref(refNo);
    }
}

package com.yimnlu.AML_Platform.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yimnlu.AML_Platform.dao.DepthMapper;
import com.yimnlu.AML_Platform.model.SuspectDimensions;
import com.yimnlu.AML_Platform.service.DepthService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DepthServiceImpl extends ServiceImpl<DepthMapper, SuspectDimensions> implements DepthService {
    @Resource
    DepthMapper depthMapper;
    @Override
    public SuspectDimensions suspectDimensionsQueryByACCT(String ACCT) {
        return new SuspectDimensions(ACCT,depthMapper.QueryCount(ACCT,"STR0003",null),depthMapper.QueryCount(ACCT,"STR0001","STR0002"),
                depthMapper.QueryCount(ACCT,"1101",null),depthMapper.QueryCount(ACCT,"0502",null),
                depthMapper.QueryCount(ACCT,"0006",null));
    }
}

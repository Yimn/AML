package com.yimnlu.AML_Platform.service;

import com.baomidou.mybatisplus.service.IService;
import com.yimnlu.AML_Platform.model.SuspectDimensions;


public interface DepthService extends IService<SuspectDimensions> {
        SuspectDimensions suspectDimensionsQueryByACCT(String ACCT);
}

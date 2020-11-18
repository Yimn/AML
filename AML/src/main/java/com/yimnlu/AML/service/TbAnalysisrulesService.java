package com.yimnlu.AML.service;

import com.baomidou.mybatisplus.service.IService;
import com.yimnlu.AML.entity.TbAnalysisrules;

import java.util.HashMap;
import java.util.List;

public interface TbAnalysisrulesService extends IService<TbAnalysisrules> {
    public HashMap<String,String> TreatRules(List<TbAnalysisrules> _Analysis_Rules_);
}

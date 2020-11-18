package com.yimnlu.AML.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yimnlu.AML.dao.TbAnalysisrulesMapper;
import com.yimnlu.AML.entity.TbAnalysisrules;
import com.yimnlu.AML.service.TbAnalysisrulesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Slf4j
@Service
public class TbAnalysisrulesServiceImpl extends ServiceImpl<TbAnalysisrulesMapper, TbAnalysisrules> implements TbAnalysisrulesService {
    public HashMap<String, String> TreatRules(List<TbAnalysisrules> _Analysis_Rules_) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        log.debug("TreatRules reached");
        for (TbAnalysisrules tbAnalysisrules : _Analysis_Rules_) {
            if (!tbAnalysisrules.getRuleCode().equals("@N")) {
                log.info(tbAnalysisrules.getRuleCode() + "      " + tbAnalysisrules.getRuleNotes() + "");
                hashMap.put(tbAnalysisrules.getRuleCode(), tbAnalysisrules.getRuleNotes());
            }
        }
        return hashMap;
    }
}

package com.yimnlu.AML_Platform.executor.AmlDTA.AfterFetch;

import com.yimnlu.AML_Platform.entity.AmlDTA;
import com.yimnlu.AML_Platform.executor.AmlDTA.dtaStorage.dtaStorage;

public class AfterFetch {
    public static void exec() {
        for (AmlDTA amlDTA : dtaStorage.amlDTAList) {
            if (amlDTA.getFundUsage().equals("@N")) {

            }
        }
    }
}

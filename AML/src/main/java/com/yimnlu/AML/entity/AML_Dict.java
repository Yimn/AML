package com.yimnlu.AML.entity;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

@TableName("AML_DICT")
@Data
public class AML_Dict {
    private String BANK;
    private String APPLICATION;
    private String GROUP_CODE;
    private String GROUP_NAME;
    private String META_VAL;
    private String META_NAME;
    private String CREATOR;
    private String CREATE_TIME;
    private String MOD_USER;
    private String MOD_DATE;
    private String ENABLE;
    private String REMARK;
    private String MOD_ABLE;

}

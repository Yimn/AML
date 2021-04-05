package com.yimnlu.AML.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class visualByRule implements Serializable {
    int value;
    String name;
    String code;

    public visualByRule(int value, String name) {
        this.name = name;
        this.value = value;
    }

    public visualByRule(int value, String name, String code) {
        this.name = name;
        this.value = value;
        this.code = code;
    }
}

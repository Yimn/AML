package com.yimnlu.AML.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author luyimin
 * @since 2021-03-10
 */
public class AmlStatus implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String funcName;
    private Integer status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFuncName() {
        return funcName;
    }

    public void setFuncName(String funcName) {
        this.funcName = funcName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "AmlStatus{" +
        "id=" + id +
        ", funcName=" + funcName +
        ", status=" + status +
        "}";
    }
}

package com.kchen.dubbo.demo.api.domain;

import java.io.Serializable;

/**
 * RPC调用的返回值
 */
public class Result <T> implements Serializable{

    private static final long serialVersionUID = 8391354759408142644L;

    /*
     * 返回模型
     */
    private T model;

    /*
     * 错误码
     */
    private String errorCode;

    /*
     * 是否业务成功
     */
    private boolean success;

    public T getModel() {
        return model;
    }

    public void setModel(T model) {
        this.model = model;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}

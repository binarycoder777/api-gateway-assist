package com.cqut.atao.gateway.assist.common;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName Result.java
 * @Description 统一返回对象中，Code码、Info描述
 * @createTime 2023年10月08日 22:24:00
 */
public class Result {

    private String code;
    private String info;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}

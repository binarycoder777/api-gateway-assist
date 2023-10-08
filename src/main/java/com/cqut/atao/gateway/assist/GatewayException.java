package com.cqut.atao.gateway.assist;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName GatewayException.java
 * @Description 网关异常
 * @createTime 2023年10月08日 22:23:00
 */
public class GatewayException extends RuntimeException {

    public GatewayException(String msg) {
        super(msg);
    }

    public GatewayException(String msg, Throwable cause) {
        super(msg, cause);
    }

}


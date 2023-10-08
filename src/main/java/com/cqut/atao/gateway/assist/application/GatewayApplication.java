package com.cqut.atao.gateway.assist.application;

import com.cqut.atao.gateway.assist.config.GatewayServiceProperties;
import com.cqut.atao.gateway.assist.service.RegisterGatewayService;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName GatewayApplication.java
 * @Description 网关应用；与 Spring 链接，调用网关注册和接口拉取
 * @createTime 2023年10月08日 22:25:00
 */
public class GatewayApplication implements ApplicationListener<ContextRefreshedEvent> {

    private GatewayServiceProperties properties;
    private RegisterGatewayService registerGatewayService;

    public GatewayApplication(GatewayServiceProperties properties, RegisterGatewayService registerGatewayService) {
        this.properties = properties;
        this.registerGatewayService = registerGatewayService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // 1. 注册网关服务；每一个用于转换 HTTP 协议泛化调用到 RPC 接口的网关都是一个算力，这些算力需要注册网关配置中心
        registerGatewayService.doRegister(properties.getAddress(),
                properties.getGroupId(),
                properties.getGatewayId(),
                properties.getGatewayName(),
                properties.getGatewayAddress());
    }

}

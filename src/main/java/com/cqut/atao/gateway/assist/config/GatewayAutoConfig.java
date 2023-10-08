package com.cqut.atao.gateway.assist.config;

import com.cqut.atao.gateway.assist.application.GatewayApplication;
import com.cqut.atao.gateway.assist.service.RegisterGatewayService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author atao
 * @version 1.0.0
 * @ClassName GatewayAutoConfig.java
 * @Description 网关服务配置
 * @createTime 2023年10月08日 22:22:00
 */
@Configuration
@EnableConfigurationProperties(GatewayServiceProperties.class)
public class GatewayAutoConfig {

    private Logger logger = LoggerFactory.getLogger(GatewayAutoConfig.class);

    @Bean
    public RegisterGatewayService registerGatewayService() {
        return new RegisterGatewayService();
    }

    @Bean
    public GatewayApplication gatewayApplication(GatewayServiceProperties properties, RegisterGatewayService registerGatewayService) {
        return new GatewayApplication(properties, registerGatewayService);
    }

}

package com.haier.starter.mq.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 
 * RocketMQ的配置参数
 */
@Data
@ConfigurationProperties(prefix = "rocketmq")
public class MQProperties {
    private String nameServerAddress;
    private String producerGroup;
}

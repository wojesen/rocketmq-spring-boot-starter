package com.haier.starter.mq.config;

import com.haier.starter.mq.annotation.EnableMQConfiguration;
import com.haier.starter.mq.base.AbstractMQProducer;
import com.haier.starter.mq.base.AbstractMQPushConsumer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * RocketMQ配置文件
 */
@Configuration
@ConditionalOnBean(annotation = EnableMQConfiguration.class)
@AutoConfigureAfter({AbstractMQProducer.class, AbstractMQPushConsumer.class})
@EnableConfigurationProperties(MQProperties.class)
public class MQBaseAutoConfiguration implements ApplicationContextAware {
    @Autowired
    protected MQProperties mqProperties;
    protected ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

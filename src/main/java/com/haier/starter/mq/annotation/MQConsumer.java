package com.haier.starter.mq.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 
 * RocketMQ消费者自动装配注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MQConsumer {
    String consumerGroup();
    String topic();
    String messageMode() default "CLUSTERING";
    String consumeMode() default "CONCURRENTLY";
    String[] tag() default {"*"};
}

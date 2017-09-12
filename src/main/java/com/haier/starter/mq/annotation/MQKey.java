package com.haier.starter.mq.annotation;

import java.lang.annotation.*;

/**
 *
 * 用来标识作为消息key的字段
 * prefix 会作为前缀拼到字段值前面
 *
 * @since 0.0.4
 * 
 *
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MQKey {
    String prefix() default "";
}

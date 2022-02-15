package com.giimall.etcd.config.annotation;

import java.lang.annotation.*;

/**
 * @author ares on 2021-03-20.
 * @description
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EtcdPropertySources {

    EtcdPropertySource[] value();
}
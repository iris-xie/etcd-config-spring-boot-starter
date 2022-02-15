package com.giimall.etcd.config.annotation;

import com.giimall.etcd.config.component.EtcdConfigBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author ares on 2021-03-24.
 * @description
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(EtcdConfigBeanDefinitionRegistrar.class)
public @interface EnableEtcdConfig {

}

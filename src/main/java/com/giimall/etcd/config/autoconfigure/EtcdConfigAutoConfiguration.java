package com.giimall.etcd.config.autoconfigure;

import com.giimall.etcd.config.annotation.EnableEtcdConfig;
import com.giimall.etcd.config.model.EtcdConfigConstants;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author ares on 2021-03-16.
 * @description
 */
@Configuration
@EnableConfigurationProperties(value = EtcdConfigProperties.class)
@ConditionalOnProperty(name = EtcdConfigConstants.CONFIG_PROPERTIES_ENABLED, havingValue = "true")
@EnableEtcdConfig
public class EtcdConfigAutoConfiguration {

}

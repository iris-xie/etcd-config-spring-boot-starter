package com.giimall.etcd.config.util;

import com.giimall.etcd.config.autoconfigure.EtcdConfigProperties;
import com.giimall.etcd.config.model.EtcdConfigConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.core.ResolvableType;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author ares on 2021-03-20.
 * @description
 */
public class EtcdConfigPropertiesUtil {

    private static final Logger LOG = LoggerFactory.getLogger(EtcdConfigPropertiesUtil.class);

    public static EtcdConfigProperties buildEtcdConfigProperties(ConfigurableEnvironment environment) {
        EtcdConfigProperties etcdConfigProperties = new EtcdConfigProperties();
        Binder binder = Binder.get(environment);
        ResolvableType type = ResolvableType.forClass(EtcdConfigProperties.class);
        Bindable<?> target = Bindable.of(type).withExistingValue(etcdConfigProperties);
        binder.bind(EtcdConfigConstants.CONFIG_PROPERTIES_PREFIX, target);
        LOG.info("etcdConfigProperties={}", etcdConfigProperties);
        return etcdConfigProperties;
    }

}
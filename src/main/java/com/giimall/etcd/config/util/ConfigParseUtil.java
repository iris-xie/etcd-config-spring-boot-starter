package com.giimall.etcd.config.util;

import com.giimall.etcd.config.exception.EtcdConfigException;
import com.giimall.etcd.config.model.ConfigType;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.io.StringReader;
import java.util.Properties;

/**
 * @author ares on 2021-03-20.
 * @description 配置内容解析
 */
public class ConfigParseUtil {

    public static Properties toProperties(String content, String configType) {

        if (configType.equals(ConfigType.PROPERTIES.getType())) {
            return get(content);
        } else if (configType.equals(ConfigType.YAML.getType())) {
            return YamlUtil.toProperties(content);
        }

        throw new IllegalArgumentException("configType");
    }

    private static Properties get(String content) {
        Properties properties = new Properties();
        try {
            if (StringUtils.hasText(content)) {
                properties.load(new StringReader(content));
            }
        } catch (IOException e) {
            throw new EtcdConfigException("ConfigParse", e);
        }
        return properties;
    }

}

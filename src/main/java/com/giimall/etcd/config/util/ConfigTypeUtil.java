package com.giimall.etcd.config.util;

import com.giimall.etcd.config.model.ConfigType;

/**
 * @author ares on 2021-04-11.
 * @description
 */
public class ConfigTypeUtil {

    private static final String PROPERTIES_SUFFIX = ".properties";
    private static final String YAML_SUFFIX = ".yml";

    /**
     * 获取配置文件类型
     *
     * @param configType
     * @param dataId
     * @return
     */
    public static String getTypeWithDataId(ConfigType configType, String dataId) {
        String type = configType.getType();
        if (dataId.endsWith(PROPERTIES_SUFFIX)) {
            type = ConfigType.PROPERTIES.getType();
        } else if (dataId.endsWith(YAML_SUFFIX)) {
            type = ConfigType.YAML.getType();
        }
        return type;
    }
}

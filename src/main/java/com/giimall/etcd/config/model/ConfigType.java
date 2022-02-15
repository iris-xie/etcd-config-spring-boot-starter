package com.giimall.etcd.config.model;

/**
 * @author ares on 2021-03-20.
 * @description
 */
public enum ConfigType {

    PROPERTIES("properties"),

    YAML("yaml");

    String type;

    ConfigType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

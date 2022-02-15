package com.giimall.etcd.config.exception;

/**
 * @author ares on 2021-03-20.
 * @description
 */
public class EtcdConfigException extends RuntimeException {

    public EtcdConfigException(String message) {
        super(message);
    }

    public EtcdConfigException(String message, Throwable cause) {
        super(message, cause);
    }
}

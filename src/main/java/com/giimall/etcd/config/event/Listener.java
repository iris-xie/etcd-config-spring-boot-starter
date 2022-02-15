package com.giimall.etcd.config.event;

/**
 * @author ares on 2021-03-20.
 * @description
 */
public interface Listener {

    /**
     * 配置内容变更通知
     *
     * @param configInfo
     */
    void receiveConfigInfo(String configInfo);
}
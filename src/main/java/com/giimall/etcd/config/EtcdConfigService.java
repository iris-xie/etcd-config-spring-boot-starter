package com.giimall.etcd.config;

import com.giimall.etcd.config.event.Listener;
import com.giimall.etcd.config.exception.EtcdConfigException;

/**
 * @author ares on 2021-03-20.
 * @description
 */
public interface EtcdConfigService {

    /**
     * 从配置中心获取配置
     *
     * @param dataId
     * @return
     * @throws EtcdConfigException
     */
    String getConfig(String dataId) throws EtcdConfigException;

    /**
     * 监听dataId的配置变化
     *
     * @param dataId
     * @param listener
     */
    void addListener(String dataId, Listener listener);

    /**
     * 监听所有dataId的配置变化
     *
     * @param listener
     */
    void addAllListener(Listener listener);

}

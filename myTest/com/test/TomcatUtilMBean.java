package com.test;

/**
 * @Author: huangdejie
 * @Date: 2018/10/19
 */
public interface TomcatUtilMBean {

    void setServerName(String serverName);

    String getServerName();

    void setPort(int port);

    int getPort();

    String getTomcatInfo();
}

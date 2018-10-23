package com.test;

/**
 * @Author: huangdejie
 * @Date: 2018/10/19
 */
public class TomcatUtil implements TomcatUtilMBean {

    public String serverName = "Catalina";

    public int port = 8080;

    @Override
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    @Override
    public String getServerName() {
        return serverName;
    }

    @Override
    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public int getPort() {
        return port;
    }

    @Override
    public String getTomcatInfo() {
        return "Tomcat name is "+serverName+",port is "+port;
    }
}

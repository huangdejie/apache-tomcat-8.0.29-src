package com.test;

import com.sun.jdmk.comm.HtmlAdaptorServer;
import com.sun.xml.internal.ws.transport.http.HttpAdapter;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

/**
 * @Author: huangdejie
 * @Date: 2018/10/19
 */
public class TomcatMonitor {

    public static void main(String[] args) throws Exception{
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        TomcatUtilMBean tomcatUtil = new TomcatUtil();
        mBeanServer.registerMBean(tomcatUtil,new ObjectName("myBean:name=tomcatUtil"));
        HtmlAdaptorServer htmlAdaptorServer = new HtmlAdaptorServer();
        htmlAdaptorServer.setPort(8888);
        mBeanServer.registerMBean(htmlAdaptorServer,new ObjectName("mBean:name=htmlAdaptorServer"));
        htmlAdaptorServer.start();
    }

}

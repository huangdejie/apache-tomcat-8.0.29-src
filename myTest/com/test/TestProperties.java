package com.test;

import org.junit.Test;

/**
 * @Author: huangdejie
 * @Date: 2018/10/17
 */
public class TestProperties {

    @Test
    public void testAddShutdownHook(){
        Thread thread1 = new Thread(){
            public void run(){
                System.out.println("********thread1*******");
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                System.out.println("**********thread2*************");
            }
        };

        Thread thread3 = new Thread(){
            public void run(){
                System.out.println("************thread3***************");
            }
        };
        Thread shutdownThread = new Thread(){
            public void run(){
                System.out.println("_____________shutdownThread________________");
            }
        };
        Runtime.getRuntime().addShutdownHook(shutdownThread);
        thread1.start();
        thread2.start();
        thread3.start();
    }

}

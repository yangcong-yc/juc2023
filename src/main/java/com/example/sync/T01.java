package com.example.sync;

import org.openjdk.jol.info.ClassLayout;

/**
 * @ClassName T01
 * @Description TODO
 * @date 2023/4/19 14:54
 * @Version 1.0
 */
public class T01 {
    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(5000);
        Object o = new Object();


//        System.err.println(ClassLayout.parseInstance(o).toPrintable());
//        o.hashCode();
//        System.err.println(ClassLayout.parseInstance(o).toPrintable());
        synchronized (o) {
            System.err.println(ClassLayout.parseInstance(o).toPrintable());
//            synchronized (o){
//                System.err.println(ClassLayout.parseInstance());
//            }
        }

    }
}

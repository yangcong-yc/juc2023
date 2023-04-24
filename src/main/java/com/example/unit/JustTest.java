package com.example.unit;

import org.openjdk.jol.info.ClassLayout;

/**
 * @ClassName JustTest
 * @Description TODO
 * @date 2023/4/13 15:33
 * @Version 1.0
 */
public class JustTest {


    public static class T {
        String s = "";
    }

    public static void main(String[] args) {
        T t = new T();
        System.err.println(ClassLayout.parseInstance(t).toPrintable());
        t.hashCode();
        System.err.println(ClassLayout.parseInstance(t).toPrintable());
        synchronized (t) {
            System.err.println(ClassLayout.parseInstance(t).toPrintable());
        }
        System.err.println(ClassLayout.parseInstance(t).toPrintable());
    }

}

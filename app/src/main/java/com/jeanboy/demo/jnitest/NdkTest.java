package com.jeanboy.demo.jnitest;

/**
 * Created by Next on 2016/8/12.
 */
public class NdkTest {
    static {
        System.loadLibrary("NdkTest");
    }

    public static native String getString();
    public static native int doAdd(int param1,int param2);
}

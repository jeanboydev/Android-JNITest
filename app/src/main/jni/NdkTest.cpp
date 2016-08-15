//
// Created by Next on 2016/8/12.
//

#include "com_jeanboy_demo_jnitest_NdkTest.h"

JNIEXPORT jstring JNICALL Java_com_jeanboy_demo_jnitest_NdkTest_getString
        (JNIEnv *env, jclass type) {

    return env->NewStringUTF("hello world!!!");
}

/*
 * Class:     com_jeanboy_demo_jnitest_NdkTest
 * Method:    doAdd
 * Signature: (II)I
 */
JNIEXPORT jint JNICALL Java_com_jeanboy_demo_jnitest_NdkTest_doAdd
        (JNIEnv *env, jclass type, jint param1, jint param2) {

    return param1 + param1;
}


LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := NdkTest
LOCAL_SRC_FILES := NdkTest.cpp
include $(BUILD_SHARED_LIBRARY)
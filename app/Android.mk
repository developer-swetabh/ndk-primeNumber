LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := primecheck-lib
LOCAL_SRC_FILES := src/main/cpp/primecheck-lib.cpp src/main/cpp/PrimeNumber.cpp src/main/cpp/PrimeNumber.h

include $(BUILD_SHARED_LIBRARY)
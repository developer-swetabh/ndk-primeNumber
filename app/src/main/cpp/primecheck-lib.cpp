//
// Created by Swetabh Suman on 2019-10-17.
//

#include <jni.h>
#include <string.h>
#include "PrimeNumber.h"
extern "C"
JNIEXPORT jboolean JNICALL
Java_com_swetabh_checkprime_MainActivity_primeCheckJNI(JNIEnv *env, jobject thiz, jint num){

    PrimeNumber primeNumber(num);
    return primeNumber.isPrime();

}



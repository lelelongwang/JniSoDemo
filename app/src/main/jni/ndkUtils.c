//
// Created by Admitor on 2019-01-04 0004.
//

#include <jni.h>
#include "com_eben_longjunhao_ndkjnisodemo_ndk_JniUtils.h"

JNIEXPORT jstring JNICALL Java_com_eben_longjunhao_ndkjnisodemo_ndk_JniUtils_getStringFromJNI
        (JNIEnv *env, jobject obj) {
    return (*env)->NewStringUTF(env, "通过JNI成功调用C语言lalallala");
}

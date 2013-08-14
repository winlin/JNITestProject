#include "squared.h"
JNIEXPORT jint JNICALL Java_tk_laomo_demo_jni_SquaredWrapper_squared(JNIEnv *je, jobject jc, jint base)
{
	return (base*base);
}


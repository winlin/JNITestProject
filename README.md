JNITestProject
==============

Just learn how to use the JNI


## Refer :  
	1. ant usage 		 http://lmbj.net/blog/ant-build-android-project/
	2. tutorial Android JNI	 http://blog.edwards-research.com/2012/04/tutorial-android-jni/

## Step:
	1. reference <<tutorial Android JNI>> to create java wrapper class and .so library in project_one
	2. create the .jar file just include java wrapper class 

## Usage:
	1. add .jar file into target project's "libs" path
	2. add "armeabi" folder(under project_one's libs folder) into target project "libs" path
	3. refresh the project
	
## Other:
	You can just add the java wrapper class into your project without creating a ".jar" file. 
	As for me, that will be good, because you can easily found the prototype of the function and the description 
	of the class and functions. 
	What's more you also don't need to add the "armeabi" folder into the target project's "libs" path, 
	you can just put the ".so" file into Android system path: /system/lib/. This need root your Android.
	This is the mount example:
	mount -o remount,rw -t ext4 /dev/sda1 /system/


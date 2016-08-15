# Android-JNITest
Android Studio JNI environment.  
Android Studio JNI环境配置。

------

##介绍

Android Studio + NDK来实现JNI。

什么是NDK与JNI技术？  
NDK：Native Development Kit  

The NDK is a toolset that allows you to implement parts of your app using native-code languages such as C and C++.（谷歌官方文档）

大致意思：NDK是一个工具，可以让你实现你的应用程序使用本地代码的语言，如C和C++的部分。

JNI：Java Native Interface  
它提供了若干的API实现了Java和其他语言的通信（主要是C&C++）。从Java1.1开始，JNI标准成为java平台的一部分，它允许Java代码和其他语言写的代码进行交互。

##准备工作

* 1.搭建好Android Studio开发环境。
* 2.新建一个Android项目

##Android Studio配置NDK
* 1.如图所示下载LLDB+NDK并安装。  
![第一][1]

* 2.配置安装好的NDK路径。  
![第二][2]

* 3.配置一些快捷方式。  
![第三][3]  
```text
	javah	用于生成头文件
	Program：$JDKPath$/bin/javah
	注意：这个命令我加上了-encoding UTF-8指定编码，你可以改成你工程的编码。
	Parameters：-encoding UTF-8 -d ../jni -jni $FileClass$
	Working directory：$SourcepathEntry$\..\java

	ndk-build	用于构建so包
	注意：MAC/Linux用ndk-build，没有.cmd后缀
	Program：C:\Develop\Android\sdk\ndk-bundle\ndk-build.cmd
	Parameters：什么都不用填
	Working directory：$ModuleFileDir$\src\main

	ndk-build clean	清除so包
	注意：MAC/Linux用ndk-build，没有.cmd后缀
	Program：C:\Develop\Android\sdk\ndk-bundle\ndk-build.cmd
	Parameters：clean
	Working directory：$ModuleFileDir$\src\main
```

##配置项目
* 在gradle.properties文件中添加  
```xml
	android.useDeprecatedNdk=true
```
* 修改文件目录如下  
```xml
	.
	├── app/
	│   ├── app.iml
	│   ├── <span style="color:red">build.gradle</span>
	│   └── src/
	├── build.gradle
	├── gradle/
	│   └── wrapper/
	│       ├── gradle-wrapper.jar
	│       └── gradle-wrapper.properties
	├── gradle.properties
	├── gradlew*
	├── gradlew.bat
	├── local.properties
	├── MyApplication.iml
	└── settings.gradle
```

* 参考[Android Studio Project Site](http://tools.android.com/tech-docs/new-build-system/gradle-experimental)















 [1]:https://github.com/freekite/Android-JNITest/blob/master/resources/1.png
 [2]:https://github.com/freekite/Android-JNITest/blob/master/resources/2.png
 [3]:https://github.com/freekite/Android-JNITest/blob/master/resources/3.png
 [4]:https://github.com/freekite/Android-JNITest/blob/master/resources/4.png
 [5]:https://github.com/freekite/Android-JNITest/blob/master/resources/5.png
 [6]:https://github.com/freekite/Android-JNITest/blob/master/resources/6.png
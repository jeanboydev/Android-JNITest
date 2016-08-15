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

* 导入lib-bither-compress
```java
	NativeUtil.compressBitmap(bitmap, savePath);
```
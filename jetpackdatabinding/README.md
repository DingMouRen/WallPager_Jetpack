
url:
https://www.jianshu.com/p/bd9016418af2
https://www.jianshu.com/p/2c4ac24761f5
https://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=2650242616&idx=1&sn=49587d21998e1c24537c26fc2e2a944b&chksm=88638f57bf140641db485570d62220ce2d18cffcdee86b5e97b90a8392f7fcaf14bd3a6821e8&scene=38#wechat_redirect
https://mp.weixin.qq.com/s?__biz=MzA5MzI3NjE2MA==&mid=2650238563&idx=1&sn=98b1c3b689e5658854fcda26f20461bd&chksm=88639f0cbf14161a7969c803895f0ea59c5d6d080d3acbb18df0dd2602fa56b71b93995c3592&scene=38#wechat_redirect

## Android Jetpack---DataBinding
### 1.简介
DataBinding将xml布局中的组件与数据层model绑定的框架库
###  2.优点
* 省略findViewById(xxx)
* 有助于防止内存泄漏
* 自动进行空检测，避免空指针异常

### 3.项目启用DataBinding功能
* 在module的build.gradle文件中添加如下设置
```
android {

    xxx

    //引入对 DataBinding 的支持
    dataBinding {
        enabled = true
    }

}

```

* 在gradle.properties文件中指定新的数据绑定编译器，防止旧版本数据绑定编译器的错误，就是代码无法编译时，可能会收到多个未找到绑定类的错误报告
```
android.databinding.enableV2=true
```

### 4.基础入门

4.1 生成DataBinding规则布局
打开xml布局文件，选中根布局,window按住Alt+回车键,mac按住option+回车键，点击"Convert to data binding layout"，就生成了DataBinding需要的规则布局

图片展位图

规则布局如下:
```
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools">

    <data>

    </data>

    <androidx.constraintlayout.widget.ConstraintLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            tools:context=".ui.Ex2Activity">

    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>


```
4.2声明
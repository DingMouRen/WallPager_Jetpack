
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

* layout标签：是DataBinding规则布局的最外层标签
* data标签：是View层和Model层的桥梁

```
4.2 声明Model类：Student
```
package com.dingmouren.jetpackdatabinding.model

data class Student(val name:String,val age:String)
```
4.3 xml布局中
```
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools">

    <data>
        <import type="com.dingmouren.jetpackdatabinding.ex1.Student"/>
<!--    <import
                alias="SecondStudent"
                type="com.dingmouren.jetpackdatabinding.model1.Student"/>

        <variable
                 name="studentSecond"
                 type="SecondStudent" />-->
        <variable
                name="student"
                type="Student" />

    </data>

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical"
            tools:context=".ui.Ex1Activity"
            android:gravity="center"
            >
            <TextView
                    android:id="@+id/tv_name"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:layout_gravity="center"
                    tools:text="小明"
                    android:text="@{student.name}"
                    android:textSize="40sp"
                    />
        <TextView
                android:id="@+id/tv_age"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="center"
                tools:text="18"
                android:text="@{student.age}"
                android:textSize="40sp"
                />
    </LinearLayout>
</layout>





import标签：导入功能，可以轻松的在布局文件中引用类
variable标签：类型别名功能，其中的type表示数据类型，当类名发生冲突时，可以使用别名重命名
```


4.4 Activity中操作
```
class Ex1Activity : AppCompatActivity() {

    private var binding:ActivityEx1Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_ex1)

        //创建数据model:Student
        val stu = Student("小红","18")
        binding?.student = stu
        binding?.tvName?.setTextColor(Color.RED)
    }
}

```

* ActivityEx1Binding是系统为布局文件生成的绑定类，名字是根据布局文件名来生成的，以文件名首字母大写的驼峰命名法来命名，并省略下划线，后面加上Binding

* 控件的获取方式，以控件id的首字母小写的驼峰命名法来命名，并省略下划线

上面的方式，Model层的Student发生变化时，并不会自动刷新UI，Student类型并没有实现Observable接口的基类或接口，所以变量是不可观察的

### 布局文件中的操作：

引用集合的方式如下：
```
    <data>
        <import type="android.util.SparseArray"/>
        <import type="java.util.Map"/>
        <import type="java.util.List"/>
        <variable name="list" type="List&lt;String>"/>
        <variable name="sparse" type="SparseArray&lt;String>"/>
        <variable name="map" type="Map&lt;String, String>"/>
        <variable name="index" type="int"/>
        <variable name="key" type="String"/>
    </data>
```
注意：泛型的表述在xml文件中会出错，必须将"<"进行转义，例如：不要写成 List<String> 形式，而是必须写成 List&lt;String>。

#### 属性引用
* 通过@{student.name} 让TextView引用到相关的变量，DataBinding会将@{student.name}映射到对应的getter方法，
* 集合类使用，通过[]运算符来访问数组、列表、map等，例如:{@list[index]}、@{map[key]} 、 @{map.key}
* 访问字符串字面量的map,android:text='@{map["firstName"]}' 或 android:text="@{map[`firstName`]}"
* 访问资源的表达式：android:padding="@{large? @dimen/largePadding : @dimen/smallPadding}"

在布局文件中还可以进行类型转换，以下形式就是将connection属性强制转换成类型User
```
<TextView
       android:text="@{((User)(user.connection)).lastName}"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"/>

```

布局文件中静态字段和方法的使用
```
<data>
        <import type="com.example.MyStringUtils"/>
        <variable name="user" type="com.example.User"/>
    </data>
    …
    <TextView
       android:text="@{MyStringUtils.capitalize(user.lastName)}"
       android:layout_width="wrap_content"
       android:layout_height="wrap_content"/>

```

include标签的也可以使用，但是include标签作为merge标签的直接子元素是不支持的
```
<?xml version="1.0" encoding="utf-8"?>
    <layout xmlns:android="http://schemas.android.com/apk/res/android"
            xmlns:bind="http://schemas.android.com/apk/res-auto">
       <data>
           <variable name="user" type="com.example.User"/>
       </data>
       <LinearLayout
           android:orientation="vertical"
           android:layout_width="match_parent"
           android:layout_height="match_parent">
           <!-- 支持 -->
           <include layout="@layout/name"
               bind:user="@{user}"/>
           <include layout="@layout/contact"
               bind:user="@{user}"/>
           <!-- 不支持 -->
           <merge>
                <include layout="@layout/name"
                          bind:user="@{user}"/>
                <include layout="@layout/contact"
                          bind:user="@{user}"/>
                  </merge>
       </LinearLayout>
    </layout>

```

### 5.单向数据绑定
可观察类型：对象、字段和集合
实现数据变化自动刷新UI的方式有三种：
* BaseObservable:
* ObservableField:
* ObservableCollection:
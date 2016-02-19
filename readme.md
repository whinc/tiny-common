## tiny-common

Android开发中常用工具类。


## 集成

在项目根目录的`build.gradle`文件中添加下面配置：
```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```

在项目模块中添加依赖：
```
dependencies {
    compile 'com.github.whinc:tiny-common:0.1.0'
}
```

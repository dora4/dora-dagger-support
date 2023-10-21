dora-dagger-support
![Release](https://jitpack.io/v/dora4/dora-dagger-support.svg)
--------------------------------

#### gradle依赖配置

添加以下代码到项目根目录下的settings.gradle.kts
```kotlin
dependencyResolutionManagement { {
    repositories {
        maven("https://jitpack.io")
    }
}
```
添加以下代码到app模块的build.gradle.kts
```kotlin
plugins {
    id("kotlin-kapt")
}
dependencies {
    // 扩展包必须在有主框架dora的情况下使用
    implementation("com.github.dora4:dora:1.1.38")
    implementation("com.github.dora4:dora-dagger-support:1.8")
    kapt("com.google.dagger:dagger-compiler:2.15")
}
```

#### 使用方式

在AndroidManifest中加入配置。
```xml
<application>
        <!-- Dora生命周期注入的配置 -->
        <meta-data
            android:name="dora.lifecycle.config.DaggerGlobalConfig"
            android:value="GlobalConfig"/>
</application>
```
然后重写application、activity和fragment声明周期方法中的onInjectComponent()方法。




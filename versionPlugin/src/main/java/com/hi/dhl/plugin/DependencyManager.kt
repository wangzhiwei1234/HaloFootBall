package com.hi.dhl.plugin

object Versions {
    const val retrofit = "2.9.0"
    const val appcompat = "1.2.0"
    const val coreKtx = "1.3.2"
    const val material = "1.2.1"
    const val constraintlayout = "2.0.4"
    const val kotlin = "1.4.10"
    const val room = "2.3.0-alpha03"
    const val recyclerview = "1.1.0"
    const val swiperefresh = "1.1.0"
    const val anko = "0.10.8"
    const val ktx = "2.2.0"
    const val hilt = "2.28.1-alpha"
    const val coroutines = "1.4.1"
    const val binding = "3.6.1"
    const val adapter = "2.7.2"
    const val rxjava = "2.2.20"
    const val rxAndroid = "2.1.1"
    const val okHttp = "4.9.0"
    const val liveBus = "1.7.2"
    const val umengcommon = "9.1.0"
    const val umengasms = "1.1.3"
    const val umengcrash = "0.0.4"
    const val umenglenovo = "1.0.0"
    const val umengmi = "1.0.0"
    const val umengoppo = "1.0.4"
    const val umengvivo = "1.0.0.1"
    const val multidex = "1.0.3"
    const val glide = "4.11.0"
    const val banner = "2.1.0"
    const val baseAdapter = "3.0.6"
    const val utilcode = "1.25.9"
    const val permissionx = "1.4.0"
    const val switchbutton = "2.0.2"
    const val dialogplus = "1.11@aar"
    const val matisse = "0.5.2"
    const val wechat = "6.6.5"
    const val koin = "2.0.1"
}

object AndroidX {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintlayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val swiperefresh = "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swiperefresh}"
}

object Material {
    const val material = "com.google.android.material:material:${Versions.material}"
}

object Room {
    const val runtime = "androidx.room:room-runtime:${Versions.room}"
    const val compiler = "androidx.room:room-compiler:${Versions.room}"
    const val ktx = "androidx.room:room-ktx:${Versions.room}"
}

object LifeCycle {
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ktx}"
    const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.ktx}"
    const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.ktx}"
}

object DataBinding {
    const val binding = "com.android.databinding:compiler:${Versions.binding}"
}

object Hilt {
    const val dagger = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
}

object Kt {
    const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
    const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Koin {
    const val koin_viewmodel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val koin_android = "org.koin:koin-android:${Versions.koin}"
    const val koin_androidx_scope = "org.koin:koin-androidx-scope:${Versions.koin}"
}

object Coroutines {
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
}

object LiveBus {
    const val livebus = "com.jeremyliao:live-event-bus-x:${Versions.liveBus}"
}

object Anko {
    const val common = "org.jetbrains.anko:anko-common:${Versions.anko}"
}

object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.adapter}"
}

object RxJava {
    const val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
}

object OkHttp {
    const val okHttp = "com.squareup.okhttp3:logging-interceptor:${Versions.okHttp}"
}

object Umeng {
    const val common = "com.umeng.umsdk:common:${Versions.umengcommon}"
    const val asms = "com.umeng.umsdk:asms:${Versions.umengasms}"
    const val crash = "com.umeng.umsdk:crash:${Versions.umengcrash}"
    const val lenovo = "com.umeng.umsdk:oaid_lenovo:${Versions.umenglenovo}"
    const val mi = "com.umeng.umsdk:oaid_mi:${Versions.umengmi}"
    const val oppo = "com.umeng.umsdk:oaid_oppo:${Versions.umengoppo}"
    const val vivo = "com.umeng.umsdk:oaid_vivo:${Versions.umengvivo}"
}

object GitHub {
    const val multidex = "com.android.support:multidex:${Versions.multidex}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val banner = "com.youth.banner:banner:${Versions.banner}"
    const val baseAdapter = "com.github.CymChad:BaseRecyclerViewAdapterHelper:${Versions.baseAdapter}"
    const val utilcode = "com.blankj:utilcode:${Versions.utilcode}"
    const val permissionx = "com.permissionx.guolindev:permissionx:${Versions.permissionx}"
    const val switchbutton = "com.kyleduo.switchbutton:library:${Versions.switchbutton}"
    const val dialogplus = "com.orhanobut:dialogplus:${Versions.dialogplus}"
    const val matisse = "com.zhihu.android:matisse:${Versions.matisse}"
    const val weChatPay = "com.tencent.mm.opensdk:wechat-sdk-android-without-mta:${Versions.wechat}"
}
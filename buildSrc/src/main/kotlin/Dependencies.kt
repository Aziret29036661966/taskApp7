class Dependencies {

    object Plugins {
        const val androidApplication = "com.android.application"
        const val jetbrainsKotlin = "org.jetbrains.kotlin.android"
        const val googleDaggerHilt = "com.google.dagger.hilt.android"
        const val kotlinKapt = "kotlin-kapt"
        const val androidLibrary = "com.android.library"
        const val javaLibrary = "java-library"
        const val jetbrainsKotlinJvm = "org.jetbrains.kotlin.jvm"
        const val kotlin = "kotlin"
    }

    object Config {
        const val compileSdk = 32
        const val applicationId = "com.example.homework1_7m"
        const val minSdk = 26
        const val targetSdk = 32
        const val versionCode = 1
        const val versionName = "1.0"
        const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        const val jvmTarget = "1.8"
        const val consumerProguardFiles = "consumer-rules.pro"
    }

    object UI {
        const val androidxCore = "androidx.core:core-ktx:1.8.0"
        const val androidxAppcompat = "androidx.appcompat:appcompat:1.5.0"
        const val androidMaterial = "com.google.android.material:material:1.6.1"
        const val androidConstraint = "androidx.constraintlayout:constraintlayout:2.1.4"
        const val junit = "junit:junit:4.13.2"
        const val androidTest = "androidx.test.ext:junit:1.1.3"
        const val androidTestEspresso = "androidx.test.espresso:espresso-core:3.4.0"
        const val androidFragment = "androidx.fragment:fragment-ktx:1.5.2"
    }

    object LiveData {
        private const val lifecycleVersion = "2.6.0-alpha01"
        const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
        const val lifecycleLiveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
        const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
    }

    object Navigation {
        private const val navVersion = "2.5.1"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navVersion"
        const val navigationUIKts = "androidx.navigation:navigation-ui-ktx:$navVersion"
    }

    object Room {
        private const val roomVersion = "2.4.3"
        const val roomRuntime = "androidx.room:room-runtime:$roomVersion"
        const val roomCompiler = "androidx.room:room-compiler:$roomVersion"
        const val roomKaptCompiler = "androidx.room:room-compiler:$roomVersion"
        const val roomKtx = "androidx.room:room-ktx:$roomVersion"
    }

    object Coroutines {
        const val kotlinxCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.1"
    }

    object DaggerHilt {
        const val daggerHiltAndroid = "com.google.dagger:hilt-android:2.43"
        const val daggerHiltCompiler = "com.google.dagger:hilt-compiler:2.43"
    }

    object Javax {
        const val inject = "javax.inject:javax.inject:1"
    }
}
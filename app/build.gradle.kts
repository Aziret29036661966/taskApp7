plugins {
    id (Dependencies.Plugins.androidApplication)
    id (Dependencies.Plugins.jetbrainsKotlin)
    id (Dependencies.Plugins.googleDaggerHilt)
    id (Dependencies.Plugins.kotlinKapt)
}

android {
    compileSdk = Dependencies.Config.compileSdk

    defaultConfig {
        applicationId = Dependencies.Config.applicationId
        minSdk = Dependencies.Config.minSdk
        targetSdk = Dependencies.Config.targetSdk
        versionCode = Dependencies.Config.versionCode
        versionName = Dependencies.Config.versionName

        testInstrumentationRunner = Dependencies.Config.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Dependencies.Config.jvmTarget
    }
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation (Dependencies.UI.androidxCore)
    implementation (Dependencies.UI.androidxAppcompat)
    implementation (Dependencies.UI.androidMaterial)
    implementation (Dependencies.UI.androidConstraint)
    testImplementation (Dependencies.UI.junit)
    androidTestImplementation (Dependencies.UI.androidTest)
    androidTestImplementation (Dependencies.UI.androidTestEspresso)
    implementation (Dependencies.UI.androidFragment)

    //LifeData
    implementation (Dependencies.LiveData.lifecycleViewModel)
    implementation (Dependencies.LiveData.lifecycleLiveData)
    implementation (Dependencies.LiveData.lifecycleRuntime)

    //Navigation
    implementation(Dependencies.Navigation.navigationFragment)
    implementation(Dependencies.Navigation.navigationUIKts)

    //room
    implementation (Dependencies.Room.roomRuntime)
    annotationProcessor (Dependencies.Room.roomCompiler)
    kapt(Dependencies.Room.roomKaptCompiler)
    implementation(Dependencies.Room.roomKtx)

    // Coroutines
    implementation (Dependencies.Coroutines.kotlinxCoroutines)

    // Dagger-Hilt
    implementation (Dependencies.DaggerHilt.daggerHiltAndroid)
    kapt (Dependencies.DaggerHilt.daggerHiltCompiler)

    //CoreUI module
    implementation(project(":core_ui"))

    //Core module
    implementation(project(":core"))

    //Domain
    implementation(project(":domain"))

    //Data
    implementation(project(":data"))


}
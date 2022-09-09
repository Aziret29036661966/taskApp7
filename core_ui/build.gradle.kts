plugins {
    id(Dependencies.Plugins.androidLibrary)
    id(Dependencies.Plugins.jetbrainsKotlin)
    id (Dependencies.Plugins.kotlinKapt)
}

android {
    compileSdk = Dependencies.Config.compileSdk

    defaultConfig {
        minSdk = Dependencies.Config.minSdk
        targetSdk = Dependencies.Config.targetSdk

        testInstrumentationRunner = Dependencies.Config.testInstrumentationRunner
        consumerProguardFiles(Dependencies.Config.consumerProguardFiles)
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = Dependencies.Config.jvmTarget
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    //Core module
    implementation(project(":core"))


    implementation(Dependencies.UI.androidxCore)
    implementation(Dependencies.UI.androidxAppcompat)
    implementation(Dependencies.UI.androidMaterial)
    testImplementation(Dependencies.UI.junit)
    androidTestImplementation(Dependencies.UI.androidTest)
    androidTestImplementation(Dependencies.UI.androidTestEspresso)

    //LifeData
    implementation (Dependencies.LiveData.lifecycleViewModel)
    implementation (Dependencies.LiveData.lifecycleLiveData)
    implementation (Dependencies.LiveData.lifecycleRuntime)

}
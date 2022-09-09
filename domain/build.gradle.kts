plugins {
    id(Dependencies.Plugins.javaLibrary)
    id(Dependencies.Plugins.jetbrainsKotlinJvm)
    id(Dependencies.Plugins.kotlin)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {

    //Module core
    implementation(project(":core"))

    //Javax Inject
    implementation(Dependencies.Javax.inject)

    //Coroutines
    implementation(Dependencies.Coroutines.kotlinxCoroutines)
}
plugins {
    id(Dependencies.Plugins.javaLibrary)
    id(Dependencies.Plugins.jetbrainsKotlinJvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}
 dependencies {

     //Coroutines
     implementation(Dependencies.Coroutines.kotlinxCoroutines)
 }
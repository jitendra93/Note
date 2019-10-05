/**
 * The first line in the build configuration applies the Android plugin for
 * Gradle to this build and makes the android block available to specify
 * Android-specific build options.
 */

plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

/**
 * The android block is where you configure all your Android-specific
 * build options.
 */
android {
    compileSdkVersion(29)
    defaultConfig {
        applicationId = "com.jitendraalekar.note"
        minSdkVersion(21)
        targetSdkVersion(29)
        versionCode  = 1
        versionName  = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.41")
    implementation ("androidx.appcompat:appcompat:1.0.2")
    implementation ("androidx.core:core-ktx:1.0.2")
    implementation ("androidx.constraintlayout:constraintlayout:1.1.3")
    implementation ("androidx.lifecycle:lifecycle-extensions:2.0.0")
    implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.0.0")
    testImplementation ("junit:junit:4.12")
    androidTestImplementation ("androidx.test:runner:1.1.1")
    androidTestImplementation ("androidx.test.espresso:espresso-core:3.1.1")
}

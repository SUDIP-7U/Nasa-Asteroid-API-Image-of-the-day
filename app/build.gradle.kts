plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    kotlin("kapt")
    id("kotlin-parcelize")
    alias(libs.plugins.safeArgs)
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.apollo11"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.apollo11"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    dataBinding{
        enable = true
    }
    // Allow references to generated code
kapt {
   correctErrorTypes = true
}

    viewBinding{
        enable = true
    }
}

dependencies {
    //   kapt("androidx.room:room-compiler:2.6.1")

    ksp("androidx.room:room-compiler:2.6.1")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    implementation(libs.moshi)
    implementation(libs.moshi.kotlin)
    implementation(libs.moshi.converter)
    implementation(libs.room)
    implementation(libs.room.coroutines)
    implementation(libs.coroutines.core)
    implementation(libs.coroutines.android)
    implementation(libs.work)
    implementation(libs.timber)
    implementation(libs.picasso)
    implementation(libs.retrofit)
    implementation(libs.retrofit.scalars)

    implementation(libs.glide)
    implementation (libs.material.v190)
}
plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.hamnaapptask"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.example.hamnaapptask"
        minSdk = 24
        targetSdk = 36
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
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation("de.hdodenhof:circleimageview:3.1.0")
    // AndroidX Test - JUnit
    androidTestImplementation("androidx.test.ext:junit:1.1.5")

// Espresso Core
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

// JUnit for local unit tests
    testImplementation("junit:junit:4.13.2")

// AndroidX Test Runner
    androidTestImplementation("androidx.test:runner:1.5.2")

// AndroidX Test Rules
    androidTestImplementation("androidx.test:rules:1.5.0")

}
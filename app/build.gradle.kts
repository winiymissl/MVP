plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.example.winiycare"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.winiycare"
        minSdk = 26
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    //recyclerviewAnimation
    implementation("jp.wasabeef:recyclerview-animators:4.0.2")
    //retrofit
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
    implementation("com.squareup.retrofit2:adapter-rxjava3:2.11.0")
    //rxjava
    implementation("io.reactivex.rxjava3:rxjava:3.1.8")
    //RxJava的依赖包
    implementation("io.reactivex.rxjava3:rxandroid:3.0.2")
    //Logger
    implementation("com.orhanobut:logger:2.2.0")
    //Glide
    implementation("com.github.bumptech.glide:glide:4.16.0")
    implementation("jp.wasabeef:glide-transformations:4.3.0")
    //Banner
    implementation("io.github.youth5201314:banner:2.2.3")
    //navigation
    val nav_version = "2.7.7"
    implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
    //multiple-status-view
    implementation("com.classic.common:multiple-status-view:1.7")
    //easyPermission
    implementation("pub.devrel:easypermissions:3.0.0")
    //leakCanary
    //debugImplementation("com.squareup.leakcanary:leakcanary-android:2.14")
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
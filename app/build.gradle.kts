@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
  alias(libs.plugins.com.android.application)
  alias(libs.plugins.org.jetbrains.kotlin.android)
  alias(libs.plugins.paparazzi)
}

android {
  namespace = "com.example.reproapplication"
  compileSdk = 33
  compileSdkPreview = "UpsideDownCake"

  defaultConfig {
    applicationId = "com.example.reproapplication"
    minSdk = 30
    targetSdk = 33
    versionCode = 1
    versionName = "1.0"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  buildTypes {
    debug {
      applicationIdSuffix = ".debug"
      isDebuggable = true
      isTestCoverageEnabled = true // Unlocks code coverage
    }
    release {
      // Enables code shrinking, obfuscation, and optimization for only
      // your project's release build type. Make sure to use a build
      // variant with `isDebuggable=false`.
      isMinifyEnabled = false
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
    }
  }
  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
    isCoreLibraryDesugaringEnabled = true
  }
  kotlinOptions {
    jvmTarget = "17"
  }
  kotlin {
    jvmToolchain(17)
  }
  buildFeatures {
    compose = true
  }
  composeOptions {
    kotlinCompilerExtensionVersion = "1.5.2"
  }
//  testOptions {
//    unitTests.all {
//      if (JavaVersion.current() >= JavaVersion.VERSION_13) {
//        it.jvmArgs("-XX:+AllowRedefinitionToAddDeleteMethods")
//      }
//    }
//  }
}

dependencies {

  implementation(libs.core.ktx)
  implementation(libs.lifecycle.runtime.ktx)
  implementation(libs.activity.compose)
  implementation(platform(libs.compose.bom))
  implementation(libs.ui)
  implementation(libs.ui.graphics)
  implementation(libs.ui.tooling.preview)
  implementation(libs.material3)

  coreLibraryDesugaring(libs.desugarJdkLibs)

  testImplementation(libs.junit)

  // Android UI Testing
  androidTestImplementation(libs.ui.test.junit4)
  debugImplementation(libs.ui.test.manifest)
}
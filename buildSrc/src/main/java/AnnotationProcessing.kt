package dependencies

object AnnotationProcessing {
    val lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle_version}"
      val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt_android_compiler}"
     val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltCompiler}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"
    val room = "androidx.room:room-compiler:${Versions.room}"
}
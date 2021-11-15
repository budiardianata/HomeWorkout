buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.gradle)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.0")
        classpath(Dependencies.navigationSafeArgs)
        classpath(Dependencies.googleServices)
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
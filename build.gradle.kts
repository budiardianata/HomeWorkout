buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Dependencies.gradle)
        classpath(Dependencies.navigationSafeArgs)
        classpath(Dependencies.googleServices)
        classpath(kotlin(module = "gradle-plugin", version = Versions.kotlin))
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
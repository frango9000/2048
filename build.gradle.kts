import com.soywiz.korge.gradle.*

buildscript {
    repositories {
        mavenLocal()
        google()
        maven { url = uri("https://dl.bintray.com/korlibs/korlibs") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
        mavenCentral()
        google()
    }
    dependencies {
        classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:3.4.0")
    }
}

apply<KorgeGradlePlugin>()

korge {
    id = "dev.kurama.puzzle2048"
    name = "2048"
    icon = file("src/commonMain/resources/korge.png")
// To enable all targets at once

    //targetAll()

// To enable targets based on properties/environment variables
    //targetDefault()

// To selectively enable targets

    targetJvm()
    targetJs()
    //targetDesktop()
    //targetIos()
    //targetAndroidIndirect() // targetAndroidDirect()
}

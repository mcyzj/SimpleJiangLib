plugins {
    kotlin("jvm") version "2.0.0"
}

group = "com.mcyzj.lib"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(kotlin("stdlib-jdk8"))
    compileOnly(fileTree("shadowLibs"))
    compileOnly(fileTree("libs"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}
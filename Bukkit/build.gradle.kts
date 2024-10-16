plugins {
    java
    id("com.github.johnrengelman.shadow") version ("7.1.2")
    kotlin("jvm") version "1.9.20"
    `maven-publish`
}

group = "com.mcyzj.lib"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
}

dependencies {
    compileOnly(kotlin("stdlib-jdk8"))
    compileOnly(fileTree("shadowLibs"))
    compileOnly(fileTree("libs"))
    compileOnly("org.spigotmc:spigot-api:1.16.5-R0.1-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(11)
}
plugins {
    kotlin("jvm") version "2.0.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.squareup.okhttp3:okhttp:4.11.0") // HTTP client
    implementation("com.google.code.gson:gson:2.10.1") // JSON parser
}

tasks.test {
    useJUnitPlatform()
}
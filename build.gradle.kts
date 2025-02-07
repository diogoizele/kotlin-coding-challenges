plugins {
    kotlin("jvm") version "2.1.0"
}

group = "com.diogoizele"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testImplementation("org.junit.vintage:junit-vintage-engine:5.10.0") // To run JUnit 4 with Exercism tests
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

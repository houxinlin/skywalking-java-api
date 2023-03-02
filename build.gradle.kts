plugins {
    id("java")
}

group = "com.houxinlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")

    implementation ("co.elastic.clients:elasticsearch-java:8.6.2")
    implementation ("com.fasterxml.jackson.core:jackson-databind:2.12.3")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
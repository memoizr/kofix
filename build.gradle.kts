import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.21"
    `maven-publish`
    `java-library`
}

group = "io.github.memoizr"
version = "1.0.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.dom4j:dom4j:2.1.4")
    implementation("org.jetbrains.kotlin:kotlin-reflect:2.0.21")
    implementation("org.apache.commons:commons-lang3:3.5")
    implementation("org.javassist:javassist:3.27.0-GA")
    implementation("io.github.classgraph:classgraph:4.8.95")
    implementation("com.google.code.gson:gson:2.11.0")

    testImplementation("com.github.memoizr:assertk-core:-SNAPSHOT")
    testImplementation(kotlin("test-junit"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "17"
    kotlinOptions.freeCompilerArgs = listOf(
        "-Xcontext-receivers",
    )
}

tasks.withType<JavaCompile>() {
    options.forkOptions.jvmArgs = listOf(
        "--add-opens=java.base/sun.reflect.generics.reflectiveObjects=ALL-UNNAMED",
        "--add-exports=java.base/sun.reflect.generics.reflectiveObjects=ALL-UNNAMED"
    )
    targetCompatibility = "17"
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "io.github.memoizr"
            artifactId = "kofix"
            version = "1.0.0"

            from(components["java"])
        }
    }
}



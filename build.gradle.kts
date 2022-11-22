import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
//    maven()
}

group = "memoizr"
version = "1.0"

repositories {
    mavenCentral()
    maven("https://jitpack.io")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("dom4j:dom4j:1.6.1")
//    implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.10")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.7.21")
    implementation("org.apache.commons:commons-lang3:3.5")
    implementation("org.javassist:javassist:3.27.0-GA")
    implementation("io.github.classgraph:classgraph:4.8.95")
    implementation("com.google.code.gson:gson:2.10")

    testImplementation("com.github.memoizr:assertk-core:-SNAPSHOT")
    testImplementation(kotlin("test-junit"))
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.freeCompilerArgs = listOf(
        "-Xcontext-receivers",
    )
}

tasks.withType<JavaCompile>() {
    options.forkOptions.jvmArgs = listOf(
        "--add-opens=java.base/sun.reflect.generics.reflectiveObjects=ALL-UNNAMED",
        "--add-exports=java.base/sun.reflect.generics.reflectiveObjects=ALL-UNNAMED"
    )
}


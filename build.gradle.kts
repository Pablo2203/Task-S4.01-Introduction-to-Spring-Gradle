plugins {
	id("org.springframework.boot") version "3.1.4" // Asegúrate de usar esta versión o la más compatible
	id("io.spring.dependency-management") version "1.1.3"
	kotlin("jvm") version "1.9.10" // Esto es opcional, si necesitas Kotlin
	kotlin("plugin.spring") version "1.9.10" // Esto también es opcional
}

group = "cat.itacademy"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17 // Si usas Java 17 (ajusta si usas otra versión)

repositories {
	mavenCentral() // Usa Maven Central para las dependencias
}

dependencies {
	// Spring Boot Web para las anotaciones de tu clase: @RestController, @GetMapping, etc.
	implementation("org.springframework.boot:spring-boot-starter-web")

	// Dependencias de Kotlin (opcional, elimina si no usas Kotlin)
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

	// Spring Boot Starter Test (para pruebas)
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17" // Cambia según la versión de Java en tu máquina
	}
}
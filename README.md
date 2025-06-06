# S04T01N02 - Spring Boot with Gradle

This project is part of **Level 2** of the Spring and Gradle exercises. It demonstrates how to create a Spring Boot application using Gradle as the dependency manager. The purpose of this application is to become familiar with basic Gradle commands and configure a simple API REST.

---

## 📄 Description

This project consists of creating a Spring Boot application with Gradle as the build tool. The application exposes two REST API endpoints that return greetings depending on the user input.

---

## 💻 Technologies

- **Java** (minimum version 11)
- **Spring Boot** (latest stable version)
- **Gradle**
- **DevTools**
- **Spring Web**

---

## 📋 Project Metadata

- **Group**: `cat.itacademy.s04.t01.n02`
- **Artifact**: `S04T01N02`
- **Name**: `S04T01N02`
- **Description**: `S04T01N02`
- **Package Name**: `cat.itacademy.s04.t01.n02`
- **Packaging**: `Jar`

---

## 🛠️ Prerequisites

- **Java Development Kit (JDK)** (version 11 or higher)
- **Gradle** (latest version installed and configured on your system)
- **A compatible IDE**, such as IntelliJ IDEA, Eclipse, etc.

---

## ▶️ How to Run the Project

1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   ```

2. **Navigate to the project directory**:
   ```bash
   cd S04T01N02
   ```

3. **Import the project into your IDE**:
   - Use the option `File > Import > Existing Gradle Project` in Eclipse or your chosen IDE.

4. **Set the server port**:
   - Open the `application.properties` file and set the following property:
     ```properties
     server.port=9001
     ```

5. **Run the application**:
   - Use Gradle to run the Spring Boot application:
     ```bash
     gradle bootRun
     ```

---

## 🌐 API Endpoints

This project includes one REST controller named `HelloWorldController` with two GET endpoints.

1. **Endpoint: `/HelloWorld`**  
   - Receives a query parameter `name` (optional, default = `UNKNOWN`).
   - **Response**: Returns a greeting in the format `Hola, [name]. You are running a Gradle project.`.

   **Examples**:
   - Default: `http://localhost:9001/HelloWorld` → Response: `Hola, UNKNOWN. You are running a Gradle project.`
   - With name: `http://localhost:9001/HelloWorld?name=John` → Response: `Hola, John. You are running a Gradle project.`

2. **Endpoint: `/HelloWorld2`**  
   - Receives a path variable `name`.
   - **Response**: Returns a greeting in the format `Hola, [name]. You are running a Gradle project.`.

   **Examples**:
   - Default: `http://localhost:9001/HelloWorld2/UNKNOWN` → Response: `Hola, UNKNOWN. You are running a Gradle project.`
   - With name: `http://localhost:9001/HelloWorld2/John` → Response: `Hola, John. You are running a Gradle project.`

---

## 📦 Gradle Commands

Here are some basic Gradle commands for building and running the application:

- **Compile the project**:
  ```bash
  gradle build
  ```

- **Package the project**:
  ```bash
  gradle assemble
  ```

- **Clean the project**:
  ```bash
  gradle clean
  ```

- **Run the application**:
  ```bash
  gradle bootRun
  ```

---

## 🤝 Contributions

Contributions are welcome! Please follow these steps to contribute:

1. **Fork this repository.**
2. **Create a new branch**:
   ```bash
   git checkout -b feature/NewFeature
   ```
3. **Make your changes and commit them**:
   ```bash
   git commit -m "Add New Feature"
   ```
4. **Push your branch**:
   ```bash
   git push origin feature/NewFeature
   ```
5. **Submit a Pull Request**.

---

## 📚 Additional Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Gradle Documentation](https://gradle.org/)
- [Start Spring Boot: Initializr](https://start.spring.io/)

---

## 📝 License

This project is licensed under the [MIT License](LICENSE).

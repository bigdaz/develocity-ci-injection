plugins {
    id("com.gradle.develocity") version("3.19.2")
    id("com.gradle.common-custom-user-data-gradle-plugin") version("2.1")
}

develocity {
    server = "https://ge.solutions-team.gradle.com"
}

rootProject.name = "develocity-ci-injection"

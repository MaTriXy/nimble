rootProject.name = "nimble-web"

includeBuild("nimble")
include("start")

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://kotlin.bintray.com/kotlin-eap")
        maven("https://kotlin.bintray.com/kotlinx")
    }
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "kotlin-platform-js" ->
                    useModule("org.jetbrains.kotlin:kotlin-gradle-plugin:${requested.version}")
                "kotlinx-serialization" ->
                    useModule("org.jetbrains.kotlin:kotlin-serialization:${requested.version}")
                "org.jetbrains.kotlin.frontend" ->
                    useModule("org.jetbrains.kotlin:kotlin-frontend-plugin:${requested.version}")
                "com.pascalwelsch.gitversioner" ->
                    useModule("com.pascalwelsch.gitversioner:gitversioner:${requested.version}")
                "org.jetbrains.dokka" ->
                    useModule("org.jetbrains.dokka:dokka-gradle-plugin:${requested.version}")
                "com.jfrog.bintray" ->
                    useModule("com.jfrog.bintray.gradle:gradle-bintray-plugin:${requested.version}")
            }
        }
    }
}

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google();
        mavenCentral();
        maven {
            url = uri("https://repo.eclipse.org/content/repositories/paho-snapshots/")
            //uri ("https://repo.eclipse.org/content/repositories/paho-snapshots/")

        }

    }
}

rootProject.name = "My Application"
include(":app")
 
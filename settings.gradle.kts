pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
//    versionCatalogs {
//        create("libs") {
//            from(files("../"))
//        }
//    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "AppGitHub"
include(":app")

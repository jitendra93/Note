// Top-level build file where you can add configuration options common to all sub-projects/modules.


/**
 * The buildscript block is where you configure the repositories and
 * dependencies for Gradle itself—meaning, you should not include dependencies
 * for your modules here. For example, this block includes the Android plugin for
 * Gradle as a dependency because it provides the additional instructions Gradle
 * needs to build Android app modules.
 */
buildscript {


    /**
     * The repositories block configures the repositories Gradle uses to
     * search or download the dependencies. Gradle pre-configures support for remote
     * repositories such as JCenter, Maven Central, and Ivy. You can also use local
     * repositories or define your own remote repositories. The code below defines
     * JCenter as the repository Gradle should use to look for its dependencies.
     */


    //val kotlin_version = '1.3.41'
    repositories {
        google()
        jcenter()
        
    }

    /**
     * The dependencies block configures the dependencies Gradle needs to use
     * to build your project. The following line adds Android plugin for Gradle
     * version 3.5.0 as a classpath dependency.
     */
    dependencies {
        classpath ("com.android.tools.build:gradle:3.5.0")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.41")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}


/**
 * The allprojects block is where you configure the repositories and
 * dependencies used by all modules in your project, such as third-party plugins
 * or libraries. However, you should configure module-specific dependencies in
 * each module-level build.gradle file. For new projects, Android Studio
 * includes JCenter and Google's Maven repository by default, but it does not
 * configure any dependencies (unless you select a template that requires some).
 */
allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

task ("clean"){
    delete(rootProject.buildDir)
}

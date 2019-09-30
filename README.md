# kotlin-native-example
A small example of a Kotlin Native project


Targets:
 * Mac osX
 * Linux [TBD]
 * JVM [TBD]
 * NodeJS [TBD]
 

Production

    ./gradlew clean linkReleaseExecutableMac
    ./gradlew clean linkReleaseExecutableLinux

Running

    ./build/bin/mac/releaseExecutable/knativedemo.kexe
    


Debug


    ./gradlew clean runDebugExecutableMac runDebugExecutableLinux



Fun with classloader.

Type `./gradlew`, you should see something like this:

```
> Configure project :
Kotlin Version: 1.5.31
Kotlin Version jar:file:~/.gradle/wrapper/dists/gradle-7.4-bin/[..]/lib/kotlin-stdlib-1.5.31.jar
DurationUnit jar: file:~/.gradle/caches/jars-9/[..]/kotlin-stdlib-1.6.10.jar
```

Looks like both stdlibs are on the classpath with 1.5.31 as a parent of 1.6.10

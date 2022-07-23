Fun with classloader.

Type `./gradlew`, you should see something like this:

```
> Configure project :
Kotlin Version: 1.5.31
Kotlin Version jar:file:/Users/mbonnin/.gradle/wrapper/dists/gradle-7.4-bin/c0gwcg53nkjbqw7r0h0umtfvt/gradle-7.4/lib/kotlin-stdlib-1.5.31.jar
DurationUnit jar: file:/Users/mbonnin/.gradle/caches/jars-9/e79137a7a908f12d7dec069ca17576cd/kotlin-stdlib-1.6.10.jar
```

Looks like both stdlibs are on the classpath with 1.5.31 as a parent of 1.6.10
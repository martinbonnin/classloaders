println("Kotlin Version: " + KotlinVersion.CURRENT)
println("Kotlin Version jar:" + KotlinVersion.CURRENT.javaClass.protectionDomain.codeSource.location.toString())
val clazz = Class.forName("kotlin.time.DurationUnit")
println("DurationUnit jar: " + clazz.protectionDomain.codeSource.location.toString())

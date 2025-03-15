@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Ann(val value: Int)

@Ann(value = 10)
class MyClass

fun main(args: Array<String>) {
    val c = MyClass()
    val x = c.javaClass.getAnnotation(Ann::class.java)
    if (x != null) {
        println("Value: ${x.value}") // Using string interpolation
    }
}

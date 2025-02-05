
fun main() {
    println("Введите первое число")
    var a = readLine()!!.toInt()
    println("Введите второе число")
    var b = readLine()!!.toInt()

    when {
        (a > b) -> a += 1
        (b > a) -> b += 1
        (a == b) -> a = a*a*a
        else -> println("Неверный формат")
    }
    println("Ответ")
    println(a)
    println(b)

}

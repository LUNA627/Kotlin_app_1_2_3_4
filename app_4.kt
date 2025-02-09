fun main() {
  println("Введите X")
    var X = readln()!!.toDouble()
    var Fx = 0!!.toDouble()
    when {
        (X >= -3.5) -> Fx = 4 * X * X + 2 * X - 19
        (X < 3.5) -> Fx = -(2 * X)/(-4 * X + 1)
        else -> println("Неверный формат данных")
    }
    println(Fx)
}
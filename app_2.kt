

fun main() {
    println("Введите число")
    var a = readLine()!!.toInt()

    when {
        (a == 1) ->  println("Один")
        (a == 2) ->  println("Два")
        (a == 3) ->  println("Три")
        (a == 4) ->  println("Четрые")
        (a == 5) ->  println("Пять")
        (a == 6) ->  println("Шесть")
        (a == 7) ->  println("Семь")
        (a == 8) ->  println("Восемь")
        (a == 9) ->  println("Девять")
        else -> println("Неверный формат")
    }





}
fun main() {
    println("Введите количество лет")
    val age = readLine()!!.toInt()

    when(age) {
        in 0..2 -> println("младенец")
        in 3..12 -> println("ребёнок")
        in 12..18 -> println("ребёнок")
        in 19..50 -> println("взрослый человек")
        in 51..90 -> println("старый человек")
        in 90..115 -> println("Долгожитель")
        else -> println("Невверный ввод числа")
    }

}
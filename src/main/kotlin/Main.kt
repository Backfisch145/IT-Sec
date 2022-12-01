
fun main() {

    println("Hallo!\nWelche Aufgabe soll gelöst werden (3A, 5A)?")

    do {
        val input = readLine()?.uppercase()
        when(input) {
            "3A" -> {
                MonoalphabetischeSubstitution().solve()
            }
            "5A" -> {
                RsaCrack().solve()
            }
            else -> {
                println("$input not found, try again!")
            }
        }
    } while (input != "")
}
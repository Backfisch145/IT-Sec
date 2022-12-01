
fun main() {

    println("Hallo!\nWelche Aufgabe soll gelöst werden (3A, 5A)?\n")
    when(readLine()?.uppercase()) {
        "3A" -> {
            MonoalphabetischeSubstitution().solve()
        }
        "5A" -> {
            RsaCrack().solve()
        }
        else -> {
            return
        }
    }
}
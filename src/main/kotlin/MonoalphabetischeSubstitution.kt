import kotlin.math.roundToInt

object MonoalphabetischeSubstitution {

//    635

    fun solve(hash: String) {
        val mapOfOccurringChars = HashMap<Char, Int>()

        hash.forEach { c: Char ->
            if (mapOfOccurringChars.keys.contains(c)) {
                mapOfOccurringChars[c] = mapOfOccurringChars[c]!! + 1
            } else {
                mapOfOccurringChars[c] = 1
            }
        }

        println("leerzeichenanteil = \" \" ${((hash.length.toFloat()/10) / hash.length.toFloat()) * 100}")

        var solution = ""
        repeat(hash.length) {
            solution += "_"
        }
        println("Vorkommende Zeichem, mit häufigkeit")
        mapOfOccurringChars.keys.sortedBy { c ->
            mapOfOccurringChars[c]
        }.reversed().forEachIndexed { index, c ->
            println("$c ${((mapOfOccurringChars[c]!!.toFloat() / hash.length.toFloat()) * 100)}")
        }

        hash.forEachIndexed { index, c ->
            solution = solution.replaceRange(
                IntRange(index, index),
                replaceCipherChar(c)
            )
        }


//        termin in fulda im februar 21.feb dienstag 9 uhr
//        unterlage, diagnoseliste
//        überweisungschein hausarzt und 20 min fruher in zentrale anmelden



        println(hash)
        println(solution)
        if (solution.indexOf("*") >= 0) {
            println("Not finished " + solution.indexOf("*"))
            val errorLocation = solution.indexOf("*")
            println(hash.substring(errorLocation-20))
            println(solution.substring(errorLocation-20))
        } else {
            println("Hash wurde geknackt!!\nlese deine eingesteten Werte ab und auf zum Elearning!")

            var loesung = ""
            "abcdefghijklmnopqrstuvwxyz".forEach {loesung += replaceCipherChar(it)  }

            println(loesung/* "UrN**i'seGacugdPwT!\"*f"*/)
            println("k:loivnDf\"U-NM,B*bhZm;q**E")
        }

//        println("1. wichtiger Fund, buchstabe M -> N durch wahrscheinlichkeit doppelter buchstaben")
//        println("2. wichtiger Fund, das Wort \"einander\"")
//        println("4. wichtiger Fund, das Wort \"und\"")
//        println("5. wichtiger Fund, das Wort \"das\"")
//        println("7. wichtiger Fund, das Wort \"auf\"")

    }


    private fun replaceCipherChar(c : Char) : String {
        return when (c) {
            'w' -> " "
            'i' -> "e"
            'M' -> "n"
            'f' -> "i"
            'b' -> "r"
            'z' -> "M"
            'k' -> "a"
            'h' -> "s"
            'o' -> "d"
            'm' -> "u"
            'v' -> "f"
            'q' -> "w"
            'D' -> "h"
            'l' -> "c"
            '-' -> "l"
            'Z' -> "t"
            'N' -> "m"
            'S' -> ":"
            'p' -> "P"
            'U' -> "k"
            'E' -> "z"
            'n' -> "g"
            '.' -> "A"
            'G' -> "F"
            'F' -> ","
            ',' -> "o"
            '?' -> "K"
            'O' -> "H"
            'H' -> "J"
            'V' -> "W"
            'B' -> "p"
            'R' -> "D"
            'r' -> "T"
            ':' -> "b"
            '\'' -> "."
            'C' -> "E"
            ' ' -> "S"
            'a' -> "U"
            ';' -> "v"
            'Q' -> "B"
            'T' -> "O"
            'L' -> ":"
            'j' -> "G"
            't' -> "\""
            'g' -> "\'"
            '!' -> "?"
            'x' -> "I"
            'A' -> "-"
            'c' -> "N"
            's' -> "!"
            '"' -> "j"
            'W' -> "V"
            'K' -> "Z"
//                    ':' -> "u"
//                    'F' -> "s"


            else -> {"*"}
        }
    }
}
class MonoalphabetischeSubstitution {
    companion object {
        const val HASH = "MwnkMEwvbimMo-flDwkM'wRkwnfMniMwhfiwEmhkNNiMwDibk:FwmMowoibw?,iMfnwibqklDZiwmMowofiw?,iMfnfMwmMowoibwnkMEiwO,vhZkkZFwmMowhkDiMwifMkMoibwNfZwnb,hhiMw.mniMwkM'waMowofiwpviboiwfNwO,vwhZkMoiMwkmvwmMowbmiZZi-ZiMwhflDSwofiwHknoDmMoiwhBbkMniMwmMowqioi-ZiMSwofiwrkm:iMwkmvwoiNwRklDiwE,niMwokhw?,iBvlDiMwmMZibNwG-mini-wDib;,bFwhkDiMwmNDibwmMowv-,niMwfMhwGi-oSwofiwG-finiMwkMwoiMwVkiMoiMwUb,lDiMwqifZibSwokhwGimibwfMwoibw?milDiwibD,:whflDFwv-klUibZiwmMowU,lDZiwokhwChhiMSwoibwQbkZiMwvfMnwqfioibwkMwEmw:bmZEi-MSwmMowoibw?,lDwnk:woiNwHmMniMwifMiwTDbvifniFwokhhwibwhlDbfiSwmMowofiwzknowbmBvZiwokhwOmDMwvibZfn'waMowokwqmboiwofiwO,lDEifZwoihw?,iMfnhh,DMhwNfZwoiNwR,bMb,ihlDiMwfMwk--ibwpbklDZwnivifibZFwmMowhfiw-i:ZiMw;ibnMminZw:fhwkMwfDbwCMoi'wChwqkbwifMNk-wifMwGfhlDibwmMowhifMiwGbkmFwofiwq,DMZiMwEmhkNNiMwfMwifMibwU-ifMiMwGfhlDibDmiZZiFwoflDZwkMwoibw iiFwmMowoibwGfhlDibwnfMnwk--iwrkniwDfMwmMowkMni-ZiLwmMowkMni-ZiwmMowkMni-Zi'w ,whkhhwibwkmlDwifMNk-wNfZwhifMibw.Mni-wmMowhkDwfNNibwfMwokhwU-kbiwVkhhibwDfMifMLwmMowh,whkhhwibwMmMwmMowhkhh'wRkwnfMnwofiw.Mni-wkmvwoiMwjbmMoFwZfivwDfMmMZibFwmMowk-hwibwhfiwDibkmvD,DiFwokwD,-ZiwibwifMiMwnb,hhiMwQmZZwDibkmh'wRkwhknZiwoibwQmZZwEmwfDNLwtO,ibwNk-FwGfhlDibFwflDw:fZZiwoflDFw-khhwNflDw-i:iMFwflDw:fMwUifMwbflDZfnibwQmZZFwflDw:fMwifMw;ibqmMhlDiMibwpbfME'wVkhwDf-vZghwofbwoiMMFwqiMMwomwNflDwZ,iZihZ!wxlDwqmiboiwofbwo,lDwMflDZwbilDZwhlDNilUiMLw iZEwNflDwqfioibwfMhwVkhhibwmMow-khhwNflDwhlDqfNNiM'twAwtcmMFtwhknZiwoibwzkMMFwtomw:bkmlDhZwMflDZwh,w;fi-iwV,bZiwEmwNklDiMLwifMiMwQmZZFwoibwhBbilDiMwUkMMFwqiboiwflDwo,lDwq,D-whlDqfNNiMw-khhiM'twRkNfZwhiZEZiwibwfDMwqfioibwfMwokhwU-kbiwVkhhib'wRkwnfMnwoibwQmZZwkmvwjbmMowmMow-fihhwifMiMw-kMniMw ZbifviMwQ-mZwDfMZibwhflD'wRkwhZkMowoibwGfhlDibwkmvwmMownfMnwEmwhifMibwGbkmwfMwofiwU-ifMiwOmiZZi'wtzkMMFtwhknZiwofiwGbkmFwtDkhZwomwDimZiwMflDZhwnivkMniM!twAwtcifMFtwhknZiwoibwzkMM'wtxlDwvfMnwifMiMwQmZZFwoibwhknZiFwibwqkibiwifMw;ibqmMhlDiMibwpbfMEFwokwDk:wflDwfDMwqfioibwhlDqfNNiMw-khhiM'twAwtOkhZwomwofbwoiMMwMflDZhwniqmiMhlDZ!twhknZiwofiwGbkm'wtcifMFtwhknZiwoibwzkMMFwtqkhwh,--ZiwflDwNfbwqmiMhlDiM!twAwt.lDFtwhknZiwofiwGbkmFwtokhwfhZwo,lDwmi:i-FwfNNibwDfibwfMwoibwOmiZZiwEmwq,DMiMLwofiwhZfMUZwmMowfhZwh,wiU-fnSwomwDkiZZihZwmMhwo,lDwifMwU-ifMihwOkimhlDiMwqmiMhlDiMwU,iMMiM'wjiDwM,lDwifMNk-wDfMwmMowbmvwfDM'w knwfDNFwqfbwq,--iMwifMwU-ifMihwOkimhlDiMwDk:iMFwibwZmZwokhwniqfhh'twAwt.lDFtwhknZiwoibwzkMMFwtqkhwh,--wflDwokwM,lDNk-wDfMniDiM!twAwtxFtwhknZiwofiwGbkmFwtomwDkZZihZwfDMwo,lDwnivkMniMwmMowDkhZwfDMwqfioibwhlDqfNNiMw-khhiMwAwibwZmZwokhwniqfhh'wjiDwn-iflDwDfMstwRibwzkMMwq,--ZiwM,lDwMflDZwbilDZFwq,--Ziwk:ibwkmlDwhifMibwGbkmwMflDZwEmqfoibDkMoi-MwmMownfMnwDfMwkMwofiw ii'w.-hwibwo,bZDfMwUkNFwqkbwofiw iiwnkMEwnbmiMwmMowni-:wmMownkbwMflDZwNiDbwh,wU-kb'w ,whZi--ZiwibwhflDwDfMwmMowhknZiLwtzkiMM-ifMFwzkiMM-ifMFwrfNBiwriFwQmZZ\"iFwQmZZ\"iwfMwoibw iiFwzifMiwGbkmFwofiwx-hi:f--FwVf--wMflDZwh,FwqfiwflDwq,D-wqf--'twRkwUkNwoibwQmZZwkMnihlDq,NNiMwmMowhknZiLwtckFwqkhwqf--whfiwoiMM!twAwt.lDFtwhknZiwoibwzkMMFwtflDwDkZZiwoflDwo,lDwnivkMniMSwMmMwhknZwNifMiwGbkmFwflDwDkiZZwNfbwo,lDwqkhwqmiMhlDiMwh,--iM'w fiwNknwMflDZwNiDbwfMwoibwOmiZZiwq,DMiMFwhfiwqf--wnibMwifMwOkimhlDiM'twAwtjiDwMmbFtwhknZiwoibwQmZZFwthfiwDkZwihwhlD,M'twRkwnfMnwoibwzkMMwDfMFwmMowhifMiwGbkmwhkhhwMflDZwNiDbwfMwoibwU-ifMiMwOmiZZiFwoiMMwkMwfDbibw Zi--iwhZkMow\"iZEZwifMwOkimhlDiMFwmMowhifMiwGbkmwhkhhw;,bwoibwrmibiwkmvwifMibwQkMU'wRkwMkDNwfDMwhifMiwGbkmw:ifwoibwOkMowmMowhknZiwEmwfDNLwt?,NNwMmbwDibifMFwhfiDFwMmMwfhZwo,lDwokhw;fi-w:ihhib'twRkwnfMniMwhfiwDfMifMFwmMowfMwoiNwOkimhlDiMwqkbwifMwU-ifMibwW,bB-kZEwmMowifMiwU-ifMiwbifMiw Zm:iwmMow?kNNibFwq,w\"ioiNwhifMwQiZZwhZkMoFwmMow?milDiwmMow BifhiUkNNibFwk--ihwkmvhw:ihZiwNfZwjibkiZhlDkvZiMw;ibhiDiMwmMowkmvhwhlD,iMhZiwkmvnihZi--ZFwKfMMEimnwmMowzihhfMnFwqkhwi:iMwh,wokEmniD,ibZ'wRkDfMZibwqkbwkmlDwifMwU-ifMibwO,vwNfZwOmiDMibMwmMowCMZiMwmMowifMwU-ifMibwjkbZiMwNfZwjbmiMEimnwmMowT:hZ'wt fiDFtwhknZiwofiwGbkmFwtfhZwokhwMflDZwMiZZ!twAwtHkFtwhknZiwoibwzkMMFwth,wh,--wihw:-if:iMSwMmMwq,--iMwqfbwbilDZw;ibnMminZw-i:iM'twAwtRkhwq,--iMwqfbwmMhw:ioiMUiMFtwhknZiwofiwGbkm'wRkMMwkhhiMwhfiwiZqkhwmMownfMniMwEmwQiZZ'w ,wnfMnwihwq,D-wMmMwklDZw,oibw;fibEiDMwrkniFwokwhknZiwofiwGbkmLwtO,ibFwzkMMFwokhwOkimhlDiMwfhZwkmlDwnkbwEmwiMnFwmMowoibwO,vwmMowoibwjkbZiMwfhZwh,wU-ifMLwoibwQmZZwDkiZZwmMhwkmlDwq,D-wifMwnb,ihhibihwOkmhwhlDiMUiMwU,iMMiM'wxlDwN,ilDZiwq,D-wfMwifMiNwnb,hhiMwhZifMibMiMw lD-,hhwq,DMiM'wjiDwDfMwEmNwQmZZFwibwh,--wmMhwifMw lD-,hhwhlDiMUiM'twAwt.lDwGbkmFtwhknZiwoibwzkMMFwtokhwOkimhlDiMwfhZw\"kwnmZwniMmnFwqkbmNwq,--iMwqfbwfMwifMiNw lD-,hhwq,DMiM!twAtxwqkhFtwhknZiwofiwGbkmFwtniDwomwNkMwDfMFwoibwQmZZwUkMMwokhwhlD,M'twAwtcifMFwGbkmFtwhknZiwoibwzkMMFwtoibwQmZZwDkZwmMhwibhZwokhwOkimhlDiMwnini:iM'wxlDwNknwMmMwMflDZwhlD,MwqfioibwU,NNiMFwoiMwQmZZwU,iMMZiwokhw;ibobfihhiM'twAwtjiDwo,lDFtwhknZiwofiwGbkmFwtibwUkMMwokhwbilDZwnmZwmMowZmZwihwkmlDwnibMSwniDwomwMmbwDfM'twRiNwzkMMwqkbwhifMwOibEwh,whlDqibFwmMowibwq,--ZiwMflDZSwibwhknZiwEmwhflDwhi-:ibLwtRkhwfhZwMflDZwbilDZ'tw.:ibwibwnfMnwo,lDwDfM'w.-hwibwkMwofiw iiwUkNFwqkbwokhwVkhhibwnkMEw;f,-iZZwmMowomMUi-:-kmwmMownbkmwmMowoflUFwmMownkbwMflDZwNiDbwh,wnbmiMwmMowni-:Fwo,lDwqkbwihwM,lDwhZf--'wRkwhZi--ZiwibwhflDwDfMwmMowhknZiLwtzkiMM-ifMFwzkiMM-ifMFwrfNBiwriFwQmZZ\"iFwQmZZ\"iwfMwoibw iiFwzifMiwGbkmFwofiwx-hi:f--FwVf--wMflDZwh,FwqfiwflDwq,D-wqf--'twtckFwqkhwqf--whfiwoiMM!twhknZiwoibwQmZZ'wt.lDFtwhknZiwoibwzkMMFwDk-:w:iZbmi:ZFwthfiwqf--wfMwifMiNwnb,hhiMwhZifMibMiMw lD-,hhwq,DMiM'twAwtjiDwMmbwDfMFwhfiwhZiDZw;,bwoibwrmibFtwhknZiwoibwQmZZ'wRkwnfMnwoibwzkMMwDfMwmMowoklDZiFwibwq,--ZiwMklDwOkmhiwniDiMFwk-hwibwk:ibwokDfMwUkNFwokwhZkMowo,bZwifMwnb,hhibwhZifMibMibwpk-khZFwmMowhifMiwGbkmwhZkMow,:iMwkmvwoibwrbiBBiwmMowq,--ZiwDfMifMniDiMLwokwMkDNwhfiwfDMw:ifwoibwOkMowmMowhknZiLwt?,NNwMmbwDibifM'twRkNfZwnfMnwibwNfZwfDbwDfMifMFwmMowfMwoiNw lD-,hhwqkbwifMiwnb,hhiwRfi-iwNfZwifMiNwNkbN,bMiMwChZbflDFwmMowokwqkbiMwh,w;fi-iwQiofiMZiFwofiwbfhhiMwofiwnb,hhiMwrmibiMwkmvFwmMowofiwVkiMoiwqkbiMwk--iw:-kMUwmMowNfZwhlD,iMiMwrkBiZiMwkmhnihZkZZiZFwmMowfMwoiMwKfNNibMw-kmZibwn,-oiMiw ZmiD-iwmMowrfhlDiFwmMowUbfhZk--iMiw"
    }

//    635

    fun solve() {
        val hash = HASH
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
        }.reversed().forEachIndexed { _, c ->
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
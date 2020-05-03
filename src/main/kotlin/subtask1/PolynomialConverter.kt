package subtask1

import java.lang.Math.abs

class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {
        var str: String
        val maxDegree = numbers.size - 1
        var xDegree = "x^"

        if (numbers.isEmpty()) {
            return null
        } else {
            str = "${numbers[0]}${xDegree}${maxDegree}"
        }
        var i = 1
        while (i < numbers.size) {
            if (numbers[i] != 0) {

                if (numbers[i] > 0) {
                    str = str + " " + "+" + " "
                } else {
                    str = str + " " + "-" + " "
                }

                if ((numbers[i] > 1) || (numbers[i] < -1)) {
                    str = str + abs(numbers[i])
                }

                if ((maxDegree - i) > 1) {
                    str = str + xDegree + "${maxDegree - i}"
                } else if ((maxDegree - i) == 1) {
                    xDegree = "x"
                    str = str + xDegree
                } else if ((maxDegree - i) == 0) {
                    xDegree = ""
                    str = str + xDegree
                }
            }
            i++
        }
        return str
    }
}


package subtask5


class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if(number.toInt() < 0) return null
        val result = mutableListOf<String>()
        var i = 0
        while (i < number.length) {
            val newResult = replaceNumber(number, i)
            result.addAll(0, newResult)
            i++
        }
        return result.toTypedArray()
    }

    private fun replaceNumber(number: String, i: Int): MutableList<String> {
        val result = mutableListOf<String>()
        var newResult: String
        if (number[i] == '5') {
            newResult = number.replace(number[i], '2')
            result.add(newResult)
            newResult = number.replace(number[i], '4')
            result.add(newResult)
            newResult = number.replace(number[i], '6')
            result.add(newResult)
            newResult = number.replace(number[i], '8')
            result.add(newResult)
        } else if (number[i] == '1') {
            newResult = number.replace(number[i], '2')
            result.add(newResult)
            newResult = number.replace(number[i], '4')
            result.add(newResult)
        } else if (number[i] == '2') {
            newResult = number.replace(number[i], '1')
            result.add(newResult)
            newResult = number.replace(number[i], '3')
            result.add(newResult)
            newResult = number.replace(number[i], '5')
            result.add(newResult)
        } else if (number[i] == '3') {
            newResult = number.replace(number[i], '2')
            result.add(newResult)
            newResult = number.replace(number[i], '6')
            result.add(newResult)
        } else if (number[i] == '4') {
            newResult = number.replace(number[i], '1')
            result.add(newResult)
            newResult = number.replace(number[i], '5')
            result.add(newResult)
            newResult = number.replace(number[i], '7')
            result.add(newResult)
        } else if (number[i] == '6') {
            newResult = number.replace(number[i], '3')
            result.add(newResult)
            newResult = number.replace(number[i], '5')
            result.add(newResult)
            newResult = number.replace(number[i], '9')
            result.add(newResult)
        } else if (number[i] == '7') {
            newResult = number.replace(number[i], '4')
            result.add(newResult)
            newResult = number.replace(number[i], '8')
            result.add(newResult)
        } else if (number[i] == '8') {
            newResult = number.replace(number[i], '5')
            result.add(newResult)
            newResult = number.replace(number[i], '7')
            result.add(newResult)
            newResult = number.replace(number[i], '9')
            result.add(newResult)
            newResult = number.replace(number[i], '0')
            result.add(newResult)
        } else if (number[i] == '9') {
            newResult = number.replace(number[i], '6')
            result.add(newResult)
            newResult = number.replace(number[i], '8')
            result.add(newResult)
        } else if (number[i] == '0') {
            newResult = number.replace(number[i], '8')
            result.add(newResult)
        }
        return result
    }
}

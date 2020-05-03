package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {

        val poster = array[0]
        val color = array[1]
        var result: Long
        var quantity = 0
        var i = 1

        while (i <= color) {
            result = factorial(color) / ((factorial(color - i)) * factorial(i))
            if (result >= poster) {
                quantity = i
                break
            }
            i++
        }
        if (quantity == 0) {
            return null
        } else {
            return quantity
        }
    }

    fun factorial(n: Int): Long {
        var result: Long = 1
        for (i in 1..n) {
            result *= i
        }
        return result
    }
}

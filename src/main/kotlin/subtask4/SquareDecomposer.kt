package subtask4

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        if (number < 0) {
            return null
        }

        val newNumber = number.toLong()
        val arrayList = newDecompose(newNumber, newNumber * newNumber)
        val newArray = mutableListOf<Int>()

        if (arrayList != null) {
            arrayList.removeAt(arrayList.size - 1)

            for (i in arrayList) {
                val element = i.toInt()
                newArray.add(element)
            }
            return newArray.toTypedArray()
        }
        return null
    }


    private fun newDecompose(number: Long, mult: Long): ArrayList<Long>? {
        if (mult == 0L) {
            val arrayList = ArrayList<Long>()
            arrayList.add(number)
            return arrayList
        }

        for (i in number - 1 downTo 0) {
            if ((mult - i * i) >= 0) {
                val arrayList = newDecompose(i, (mult - i * i))
                if (arrayList != null) {
                    arrayList.add(number)
                    return arrayList
                }
            }
        }
        return null
    }
}
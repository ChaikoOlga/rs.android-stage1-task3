package subtask3

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var newArray = mutableListOf<Int>()
        var mult = 1
        for (item in itemsFromArray) {
            if (item is Int) {
                newArray.add(item)
            }
        }

        var count = 0
        for (i in 0..newArray.size - 1) {
            if (newArray.get(i) < 0)
                count++
        }
        if (newArray.isEmpty()) {
            return 0
        }
        if (count <= 2) {
            if (numberOfItems >= newArray.size) {
                for (i in 0..newArray.size - 1) {
                    newArray.sortDescending()
                    mult = mult * newArray[i]
                }
            } else {
                var i = 0
                while (i < numberOfItems) {
                    newArray.sortDescending()
                    mult = mult * newArray[i]
                    i++
                }
            }

        } else {

            val newarray1 = mutableListOf<Int>()

            for (i in 0..newArray.size - 1) {
                if (newArray[i] < 0) {
                    Math.abs(newArray[i])
                    newarray1.add(Math.abs(newArray[i]))
                } else {
                    newarray1.add(Math.abs(newArray[i]))
                }
            }
            newArray = newarray1
            newArray.sortDescending()

            if (numberOfItems >= newArray.size) {
                for (j in 0..newArray.size - 1) {
                    mult = mult * newArray[j]
                }
            } else {
                var n = 0
                while (n < numberOfItems) {
                    mult = mult * newArray[n]
                    n++
                }
            }
        }
        return mult
    }
}

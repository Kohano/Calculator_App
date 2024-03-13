class Calculator {
    fun start() {
        
        var input= -1
        val recall: MutableList<Int> = mutableListOf()
        while (input !=0) {
            val result = calculateResult()
            recall.add(result)
            println("Pls choice one of the choice: ")
            println("0 : End the game and Show Results")
            println("1: Play again ")
            input= readln().toInt()

        }
        println(recall.takeLast(5 ))



    }

    private fun calculateResult(): Int {
        var result = 0
        println("Please give Number 1")
        val number1 = readln().toInt()
        println("Please give Number 2")
        val number2 = readln().toInt()
        println("Do you wanna:")
        println("1.Addition")
        println("2.Subtraction")
        println("3.Multiplication")
        println("4.Division")
        val operator = readln().toInt()
        when (operator) {
            1 -> {
                result = number1 + number2
            }

            2 -> {
                result = number1 - number2
            }

            3 -> {
                result = number1 * number2
            }

            4 -> {
                result = number1 / number2
            }
        }
        println("your number is :$result")
        return result
    }
}
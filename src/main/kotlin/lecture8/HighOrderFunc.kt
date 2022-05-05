package lecture8

fun isEven (number: Int): Boolean{  // function used as a parameter
    return number % 2 == 0
}

// a high order function with another function as a parameter
fun filterOnCondition(items:ArrayList<Int>, condition: (Int) -> Boolean): ArrayList<Int>{
    val result = arrayListOf<Int>()
    for (item in items){
        if (condition(item)){           // function invocation
            result.add(item)
        }
    }
    return result
}

fun main() {
    val list = arrayListOf<Int>()
    for (number in 1..10) list.add(number)

    val resultList = filterOnCondition(list, ::isEven) // extension function call, reference by name
    println(resultList)

    val resultList2 = list.filter { it % 2 == 0 } // parameter is a lambda function, parentheses can be omitted
    println(resultList2)
}


inline fun isMultipleOf (number: Int, multipleOf : Int): Boolean{  // function used as a parameter
    return number % multipleOf == 0
}

inline fun isEven (number: Int): Boolean{  // function used as a parameter
    return number % 2 == 0
}

fun  ArrayList<Int>.filterOnCondition(condition: (Int) -> Boolean): ArrayList<Int>{  //extension function AND
                                                    // a high order function with another function as a parameter
    val result = arrayListOf<Int>()
    for (item in this){
        if (condition(item)){           // function invocation
            result.add(item)
        }
    }
    return result
}

fun main() {
    val list = arrayListOf<Int>()
    for (number in 1..10){
        list.add(number)
    }

    val resultList = list.filterOnCondition(::isEven) // extension function call, reference by name
    println(resultList)
    val resultList2 = list.filterOnCondition { it -> isMultipleOf(it, 5) }// extension function call
    println(resultList2)
}



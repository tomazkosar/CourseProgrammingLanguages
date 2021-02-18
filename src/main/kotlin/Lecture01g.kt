inline fun isMultipleOf (number: Int, multipleOf : Int): Boolean{
    return number % multipleOf == 0
}

fun  ArrayList<Int>.filterOnCondition(condition: (Int) -> Boolean): ArrayList<Int>{
    val result = arrayListOf<Int>()
    for (item in this){
        if (condition(item)){
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

    val resultList = list.filterOnCondition { isMultipleOf(it, 5) }
    print(resultList)
}


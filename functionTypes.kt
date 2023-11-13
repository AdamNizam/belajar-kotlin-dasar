fun main() {
    val sum: Arithmetic = {
        valueA, valueB -> valueA + valueB
    }
    val multiply: Arithmetic = {
        valueA, valueB -> valueA * valueB 
    }
    
    println(sum(10,10))
    println(multiply(5,5))
}

typealias Arithmetic = (Int, Int) -> Int
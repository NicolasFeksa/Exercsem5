//1
/*
fun fatorial(num: Int): Int {
     return if (num == 0 || num == 1){
         1
     } else {
         num * fatorial(num - 1)
     }

}
fun main() {
    println("Digite um valor: ")
    val num = readln().toInt()
    val resultado = fatorial(num)
    println("O fatorial do número $num é $resultado")
}

 */

//2
/*
fun fibonacci(n: Int): Int {
    return if (n <= 1) {
        n
    } else {
        fibonacci(n - 1) + fibonacci(n - 2)
    }
}
fun main() {
  val result = fibonacci(10)
    println("$result")
}

 */
//3
/*
fun mdc(a: Int, b: Int): Int {
    return if (b == 0) {
        a
    } else {
        mdc(b, a % b)
    }
}
fun main() {
    var result1 = mdc(10, 20)
    println("$result1")
}

 */
//4
/*
fun isPalindrome(str: String): Boolean {
    val length = str.length
    for (i in 0 until length / 2) {
        if (str[i] != str[length - i - 1]) {
            return false
        }
    }
    return true
}

fun main() {
    val palavra1: String = "arara"
    if (isPalindrome(palavra1)) {
        println("A palavra $palavra1 é um palíndromo")
    } else {
        println("A palavra $palavra1 não é um palíndromo")
    }
}

 */
//5
/*
fun somaNumb(array: IntArray): Int {
    var soma = 0
    for (num in array) {
        soma += num
    }
    return soma
}

fun main() {
    var numeros = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    var result = somaNumb(numeros)
    println("O resultado é $result")
}

 */

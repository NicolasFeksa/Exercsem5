//1
/*
fun main() {
    val numeros = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val numerosordenados = numeros.sortedDescending()
    println("$numerosordenados") }

 */
//2
/*
fun main() {
    val numeros = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val numerosDobrados = numeros.map { it * 2 }
    println(numerosDobrados)
}

 */
//3
/*
fun main() {
    val number = listOf<Int>(1,2,3,4,5,6,7,8,9,10)
    val numerosFiltrados = number.filter { it % 2==0 }
    println(numerosFiltrados)
}

 */
//4
/*
fun main() {
    val lista = listOf<Int>(1,2,4,6,7,3,2,46)
    val maiordaLista = lista.maxBy { it }
    println(maiordaLista)
}

 */
//5
/*
fun main() {
    val numeros = listOf<Int>(1,2,3,4,5,5,64,3,2,3,4)
    val soma = numeros.sum()
    println(soma)
}
 */
//6
/*
fun operação(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

fun main() {
    val a = 15
    val b = 5
    val resultado = operação(a, b) { x, y -> x + y }
    println("A soma de $a + $b é $resultado")
}
 */
//7
fun imprimirMensagem(n: Int, mensagem: (Int) -> Unit) {
    for (i in 1..n) {
        mensagem(i)
    }
}

fun main() {
    imprimirMensagem(5) { numero ->
        println("Esta é a mensagem de número $numero")
    }
}

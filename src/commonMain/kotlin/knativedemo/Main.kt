package l3nz

import io.ktor.client.HttpClient


fun hello(): String = "Hello, Kotlin/Native! It pretty much rocks!"

fun main() {
    println(hello())

    val c = HttpClient()

    println( "HTTP client created" )


}

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        sendMessage("some text message")
        println("Message sent!!")
    }

    println("Main function")
}




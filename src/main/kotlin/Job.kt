import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val job = GlobalScope.launch {
        sendMessage("some text message")
        println("Message sent!!")
    }

    println("Main function")
    job.join()
}







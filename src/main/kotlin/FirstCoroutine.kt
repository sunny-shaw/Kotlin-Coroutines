import Logger.Companion.log
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        sendMessage("some text message")
        log("Message sent!!")
    }

    log("Main function")
    Thread.sleep(2000)
}

suspend fun sendMessage(message: String) {
    delay(1000)
    log("Sending message...")
}


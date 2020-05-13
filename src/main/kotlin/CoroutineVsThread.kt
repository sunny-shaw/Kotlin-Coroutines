import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() {
//    usingThread()
    usingCoroutine()
}

fun usingThread() = runBlocking {
    repeat(100_000) {
        thread {
            Thread.sleep(4000) //simulate complex processing
            println("Not a lightweight thread")
        }
    }
}

fun usingCoroutine() = runBlocking {
    repeat(100_000) {
        launch {
            delay(4000) //simulate complex processing
            println("A lightweight thread")
        }
    }
}


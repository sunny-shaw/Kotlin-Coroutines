import kotlinx.coroutines.*

fun main() {
    dispatcherExample()
}

fun dispatcherExample() = runBlocking {
    launch(Dispatchers.Default) {
        //Utilizes shared pool of threads.
        //Should be used for CPU bound task
        log("Default")
    }

    launch(Dispatchers.Unconfined) {
        // not confined to any specific thread
        log("Unconfined")
    }

    launch(Dispatchers.IO) {
        //It utilizes the shared pool of threads.
        //Should be used for IO blocking operations.
        log("IO")
    }

    launch {
        //it uses parent's context. It uses the caller thread
        log("runBlocking")
    }
}

private fun log(message: String) {
    println("${message.padStart(30)} I'm using thread ${Thread.currentThread().name}")
}
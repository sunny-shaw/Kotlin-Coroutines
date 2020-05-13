class Logger {
    companion object {
        fun log(message: String) {
            println("Thread name: ${Thread.currentThread().name}, $message")
        }
    }
}
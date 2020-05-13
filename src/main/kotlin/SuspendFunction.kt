import kotlinx.coroutines.delay

suspend fun process(input: String): String {
    delay(1000)
    return "Processed $input"
}

//Let's see its JAVA code

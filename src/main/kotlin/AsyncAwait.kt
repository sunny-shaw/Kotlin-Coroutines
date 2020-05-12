import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() {
    sequentialFlow()  //default behaviour
//    concurrentFlow()
}

fun concurrentFlow() = runBlocking {
    val time = measureTimeMillis {
        val one = async { oneSecondTask() }
        val two = async { twoSecondTask() }

        val result = one.await() + two.await()

        println("The result is $result")
    }

    println("Time taken is $time")
}

fun sequentialFlow() = runBlocking {
    val time = measureTimeMillis {
        val one = oneSecondTask()
        val two = twoSecondTask()

        val result = one + two

        println("The result is $result")
    }

    println("Time taken is $time")
}

private suspend fun oneSecondTask(): Int {
    delay(1000)
    return 10
}

private suspend fun twoSecondTask(): Int {
    delay(2000)
    return 20
}
fun main() {
    val seq = getSequence()

    seq.forEach { value ->
        println("Value is $value")
    }
}

private fun getSequence(): Sequence<Int> {
    return sequence {
        println("Yield one")
        yield(1)

        println("Yield two")
        yield(2)

        println("Yield three")
        yield(3)
    }
}
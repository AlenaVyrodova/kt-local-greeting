package mate.academy

fun greetUsers() {
    while (true) {
        println("Please enter a name (or press Enter to quit):")
        val name = readLine()
        if (name.isNullOrBlank()) {
            break
        }
        println("Hello, $name!")
    }
}

fun main() {
    greetUsers()
}


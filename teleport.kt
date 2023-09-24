data class Location(val x: Double, val y: Double)

class Character(var location: Location) {
    fun teleport(newLocation: Location) {
        location = newLocation
    }
}

fun chooseDestination(): Location {
    println("Enter the x-coordinate of your destination: ")
    val x = readLine()?.toDoubleOrNull() ?: 0.0
    println("Enter the y-coordinate of your destination: ")
    val y = readLine()?.toDoubleOrNull() ?: 0.0
    return Location(x, y)
}

fun main() {
    // Create a Character object with an initial location at (0, 0)
    val character = Character(Location(0.0, 0.0))

    println("Character's current location: (${character.location.x}, ${character.location.y})")

    // Allow the player to choose a destination
    val destination = chooseDestination()

    // Teleport the character to the chosen destination
    character.teleport(destination)

    println("Character has been teleported to: (${character.location.x}, ${character.location.y})")
}

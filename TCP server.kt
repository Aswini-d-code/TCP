import java.net.ServerSocket

fun main() {
    println("=== Server Program Started ===")

    val server = ServerSocket(9999)
    println("Server is listening on port 9999...")

    val client = server.accept()
    println("Client connected from ${client.inetAddress.hostAddress}")

    val input = client.getInputStream().bufferedReader()
    val message = input.readLine()
    println("Received message: $message")

    println("Closing server...")
    input.close()
    client.close()
    server.close()
    println("=== Server Program Ended ===")
}


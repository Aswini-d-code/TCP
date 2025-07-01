import java.io.PrintWriter
import java.net.Socket

fun main() {
    println("=== Client Program Started ===")

    val socket = Socket("localhost", 9999)
    println("Connected to server.")

    val writer = PrintWriter(socket.getOutputStream(), true)
    val message = "Hello from client!"
    println("Sending message: $message")
    writer.println(message)
    writer.flush()

    println("Message sent. Closing connection.")
    writer.close()
    socket.close()
    println("=== Client Program Ended ===")
}
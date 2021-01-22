import java.util.*
fun main(){
    val scanner = Scanner(System.`in`)
    val order = CoffeeMachine(scanner).request()
    println("youre price will be: $order")
}
import java.util.*

 class CoffeeMachine(private val scanner: Scanner){
    fun request(): Double {
        println("Enter coffe Latte or cappuccino")
        return when (scanner.next()) {
            "latte" -> Latte(requestSugar(), requestMilk()).price()
            "cappuccino" -> Cappucinno(requestSugar(), requestMilk(), hasCinnamon()).price()
            else -> {
                println("unknown coffee type")
                return 0.0
            }
        }
    }
    private fun hasCinnamon(): Boolean {
        print("do you want cinnamon? ")
        return scanner.nextBoolean()
    }
    private fun requestSugar(): Double {
        print("how many sugar do you want? ")
        return when(val sugar = scanner.nextDouble()){
            in Double.MIN_VALUE..0.0 -> 0.0
            else -> sugar
        }
    }
    private fun requestMilk(): Double {
        print("how much milk do you want")
        return when(val sugar = scanner.nextDouble()) {
            in Double.MIN_VALUE..0.0 -> 0.0
            else -> sugar
        }
    }
    companion object nika {
        private const val cupPrice: Double = 6.00
        private const val sugarPrice: Double = 1.00
        private const val milkPrice: Double = 1.25
        private const val cinnamonPrice: Double = 1.50

        @JvmStatic
        fun calculatePrice(sugar: Double, milk: Double, cinnamon: Boolean): Double {
            return if (cinnamon) {
                sugar * sugarPrice + milk * milkPrice + cinnamonPrice + cupPrice
            } else {
                sugar * sugarPrice + milk * milkPrice + cupPrice
            }
        }
    }
}
class Latte(private var sugar: Double, private var milk: Double){
    fun price():Double{
        return CoffeeMachine.calculatePrice(sugar, milk, false)
    }
}


class Cappucinno(private var sugar: Double, private var milk: Double, private var cinnamon: Boolean){
   fun price(): Double{
       return CoffeeMachine.calculatePrice(sugar, milk, cinnamon)
   }
}
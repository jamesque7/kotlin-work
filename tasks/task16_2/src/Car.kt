// Task 16.2: concrete Car class, inheriting from Vehicle

class Car(fuelLevel: Int) : Vehicle(fuelLevel){
    override fun drive(){
        println("ZOOOOOM!")
    }
}
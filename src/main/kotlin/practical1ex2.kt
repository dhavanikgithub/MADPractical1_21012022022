fun main()
{
    var L1 = Laptop("Laptop",1,55000,"Intel i9", "32GB","4TB")
}
open class Product constructor(name:String, quantity:Long, amount_per_quantity:Long)
{
    init {
        println("$name")
    }
}
class Laptop constructor(name:String, quantity:Long, amount_per_quantity:Long, CPUName:String, RAMSize:String, HDDSize:String):Product(name, quantity, amount_per_quantity) {


}
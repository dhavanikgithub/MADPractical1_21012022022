fun main()
{
    println("Car1 Object:")

}
class Car constructor(type:String, model:String, price:Long, owner:String, miles:Long)
{
    var type:String=type
    var model:String=model
    var owner:String=owner
    var price:Long= price
    var miles:Long=miles
    var currentPrice= this.price -(miles*10)
    fun getCarInformation():String
    {
        return "Car Information: $type, $model"
    }
    fun getOriginalCarPrice():String{
        return "Car Original Price: $price"
    }
    fun getCurrentCarPrice():String{
        return "Car Current Price: $currentPrice"
    }
    fun displayCarInfo():String{
        return "Car Owner: $owner\nMiles Drive: $miles"
    }
}
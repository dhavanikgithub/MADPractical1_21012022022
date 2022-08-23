fun main()
{
    println("*****Car1 Object*****")
    var c1=Car("BMW","2018",100000,"HNJ",105)
    println("${c1.getCarInformation()}")
    println("${c1.displayCarInfo()}")
    println("${c1.getOriginalCarPrice()}")
    println("${c1.getCurrentCarPrice()}")
    println("\n*****Car2 Object*****")
    var c2=Car("BMW","2019",400000,"TGF",23)
    println("${c2.getCarInformation()}")
    println("${c2.displayCarInfo()}")
    println("${c2.getOriginalCarPrice()}")
    println("${c2.getCurrentCarPrice()}")

    println("\n*****ArrayList of Car*****")
    var alist = ArrayList<String>()
    var c3=Car("Toyota","2017",10264313,"LOP",1254)
    alist.add("${c3.getCarInformation()}\n${c3.displayCarInfo()}\n${c3.getOriginalCarPrice()}\n${c3.getCurrentCarPrice()}")
    var c4=Car("RR","2007",15487952,"KHK",5684)
    alist.add("${c4.getCarInformation()}\n${c4.displayCarInfo()}\n${c4.getOriginalCarPrice()}\n${c4.getCurrentCarPrice()}")
    for(i in alist)
    {
        println("$i \n")
    }
}
class Car constructor(type:String, model:String, price:Long, owner:String, miles:Long)
{
    var type:String=type
    var model:String=model
    var owner:String=owner
    var price:Long= price
    var miles:Long=miles
    var currentPrice= price -(miles*10)
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
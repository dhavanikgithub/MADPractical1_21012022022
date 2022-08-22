fun main()
{
    println("*************With Using Third variable***************")
    println("Before Swaping")
    var a:Int=10
    var b:Int=20
    println("a: $a, b: $b")
    println("After Swaping")
    var c:Int = a
    a=b
    b=c
    println("a: $a, b: $b")

    println("*************Without Using Third variable***************")
    a=10
    b=20
    println("Before Swaping")
    println("a: $a, b: $b")
    println("After Swaping")
    a=a+b
    b=a-b
    a=a-b
    println("a: $a, b: $b")
}
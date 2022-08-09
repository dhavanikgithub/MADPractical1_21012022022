fun main()
{
    print("Enter Num: ")
    var num:Long=readLine()!!.toLong()

    print("Factorial of $num is: ${fact(num)}")
}
fun fact(num:Long):Long{
    if(num>1)
        return num*fact(num-1)
    else
        return num
}
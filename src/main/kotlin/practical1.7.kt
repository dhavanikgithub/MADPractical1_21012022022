import java.math.BigInteger

fun main()
{
    print("Factorial is: ${fact(BigInteger("10"))}")
}
tailrec fun fact(n: BigInteger, temp: BigInteger = BigInteger("1")): BigInteger {
    return if (n == BigInteger("1")){
        temp
    } else {
        fact(n-BigInteger("1"), temp*n)
    }
}

fun main()
{
//    var mon = listOf("jan","feb","march","apr","may","jun","jul","aug","sep","oct","nev","dec")
//    print("Enter Month number: ")
//    var mon_num:Int= readLine()!!.toInt()
//    if(mon_num>=1 && mon_num <= 12)
//        print("${mon[--mon_num]}")
//    else
//        print("Enter valid month")

    print("Enter Month Number: ")
    var mon:Int= readLine()!!.toInt()
    when(mon){
        1->println("Jan")
        2->println("Feb")
        3->println("March")
        4->println("Apr")
        5->println("May")
        6->println("Jun")
        7->println("Jul")
        8->println("Aug")
        9->println("Sep")
        10->println("Oct")
        11->println("Nev")
        12->println("Dec")
        else->print("Enter valid Month")
    }
}
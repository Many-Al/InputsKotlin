/*manyDiese App ruft Benutzerinformationen ab und druckt sie dann aus
Wir haben es im Rahmen einer Lernsitzung gemacht
*/
// Neu

fun main(){
    //Nach Benutzernamen fragen
    print("Enter Name: ")
    val name    = readLine()!!.toString()
    //Nach dem Alter fragen
    print("Enter Age: ")
    val age  = readLine()!!.toInt()
    print("Enter GPA: ")
    val GPA  =  readLine()!!.toDouble()
    println("===== User info ===== ")
    println("Your Name is : $name")
    println("Your Age: $age"   )
    println("Your GPA: $GPA" )
}
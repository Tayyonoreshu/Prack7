fun main() {

    val phone = Nazv("Sony", 25000.0, 1024.0)

    if(phone.phone1 is SmartPhone1) {
        println("Марка: ${phone.phone1.name1}, Цена: ${phone.phone1.j1}, Объем памяти: ${phone.phone1.k1}, Q = ${phone.phone1.q1}, QP: ${phone.p1*phone.phone1.q1}")
    }
}
open class Phone1(val name1: String)
class SmartPhone1(name1: String, val q1: Double, val j1: Double, val k1: Double) : Phone1(name1)

open class Nazv(val name1: String,j1:Double,k1:Double){
    val phone1: Phone1 = SmartPhone1(name1, k1/j1, j1 , k1)
    var p1 = 3
}
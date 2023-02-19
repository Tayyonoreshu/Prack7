fun main() {

    val co = Cone("Megafon", 25, 500)

    if(co.set is Comset) {
        println("Название организации: ${co.set.name}, Число рабочих станций: ${co.set.j}, Среднее растояние между станциями: ${co.set.k}, Q = ${co.set.q}, QP: ${co.p*co.set.q}")
    }
}
open class Set(val name: String)
class Comset(name: String, val q: Int, val j: Int, val k: Int) : Set(name)

open class Cone(val name: String,j:Int,k:Int){
    val set: Set = Comset(name, j*k, j , k)
    var p = 26
}
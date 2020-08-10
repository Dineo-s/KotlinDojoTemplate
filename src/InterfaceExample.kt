/*
 TODO:
  -Default implementations
  -Implementing multiple interfaces
 */
interface InterfaceA {
    fun method1()
    fun method2() {
        print("Interface A")
    }
}

interface InterfaceB {
    fun method1()
    fun method2()
    fun method3()
}



class classE : InterfaceA {
    override fun method1() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

fun main() {
    val instance = classE()
    instance.method2()

}




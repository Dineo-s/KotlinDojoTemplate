open class classA(name: String) {


    open fun method1() {
        println("class a")
    }

}

class classB : classA {
    constructor(name: String) : super(name)

    override fun method1() {
        super.method1()
        println("class b")
    }


}

object objectC : classA("dineo") {

    override fun method1() {
        super.method1()
        println("object c")
    }


}

fun main() {
    var instance = classB("name")
    instance.method1()

    objectC.method1()

}
class Person{

    //Properties/Attribute/Characteristics
    var name = "John"
    var age = 34


    //Behaviour/Method/Function
    fun sound(){
        println("Person is speaking")
    }
}

fun main() {
    var teacher = Person()
    println(teacher.age)
    println(teacher.name)
    teacher.sound()

    var student = Person()


    var accountant = Person()
}
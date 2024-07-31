//Parent clas
open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
}

//Child classes
class Rectangle:Shape(){
     override fun draw(){
        println("Drawing a rectangle")
    }
}

//Child class
class Circle:Shape(){
    override fun draw(){
        println("Drawing a circle")
    }
}


fun main() {
    var myshape = Shape()
    myshape.draw()


    var mycircle = Circle()
    mycircle.draw()


    var myrectangle= Rectangle()
    myrectangle.draw()
}

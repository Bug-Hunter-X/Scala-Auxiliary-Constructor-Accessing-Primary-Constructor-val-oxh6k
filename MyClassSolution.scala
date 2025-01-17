```scala
class MyClass(val value: Int) {
  def this() = {
    this(0) 
  }
  def this(s: String) = this(s.toInt) //Another auxiliary constructor
}

object Main extends App{
  val obj1 = new MyClass()
  val obj2 = new MyClass(5)
  val obj3 = new MyClass("10")
  println(obj1.value) // 0
  println(obj2.value) // 5
  println(obj3.value) // 10
}
```
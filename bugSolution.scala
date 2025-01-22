```scala
class MyClass(val name: String) {
  def printName(): Unit = {
    println(s"My name is $name")
  }
  def getName():String = {
    name
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myObject = new MyClass("Alice")
    myObject.printName() //This will print correctly

    // Access the name using the getName method.
    println(myObject.getName()) //This will now compile and print correctly.

    val mutableObject = new MutableMyClass("Bob")
    mutableObject.printName()
    mutableObject.changeName("Charlie")
    mutableObject.printName()
  }
}

class MutableMyClass(var name: String){
  def printName(): Unit = {
    println(s"My name is $name")
  }
  def changeName(newName: String): Unit = {
    name = newName
  }
}
```
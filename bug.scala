```scala
class MyClass(val name: String) {
  def printName(): Unit = {
    println(s"My name is $name")
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myObject = new MyClass("Alice")
    myObject.printName() //This will print correctly

    // However, if you try to access the name directly using myObject.name it will return an error.
    // println(myObject.name) //This will not compile.
    //This is because the name field is a val and is not mutable.

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
object HelloWorld {


  def main(args: Array[String]): Unit = {
    println(display("world"))
  }

  def display(string: String): String ={
    return "hello "+ string
  }
}
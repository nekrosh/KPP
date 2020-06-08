object Main {
  def main(args: Array[String]) : Unit = {
    val mas:Seq[Int] = List(1, 1,1,1, 2,3,3,4,4,4,5)
    println(new Recursion().findLength(mas,1,1,1))
    println(new Unrecursion().findLength(mas))
  }
}

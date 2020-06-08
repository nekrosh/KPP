import org.scalatest.funsuite.AnyFunSuite

class AlgorithmTest extends AnyFunSuite {
    test("testBounds") {
      val mas:Seq[Int] = List(1, 1,1,1,1, 2,3,3,4,4,4,5)
      val obj1 = new Recursion();
      val obj2 = new Unrecursion();
      assert(obj1.findLength(mas,1,1,1) >0
        && obj1.findLength(mas,1,1,1) <= mas.size)
      assert(obj2.findLength(mas) >0
        && obj2.findLength(mas) <= mas.size)
  }
}

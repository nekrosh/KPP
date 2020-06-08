import org.scalatest.funsuite.AnyFunSuite
class Lab6test extends AnyFunSuite {
  test("testDestination") {
    val mas:List[Int] = List(1,-7,3,9,-2,6,12)
    assert(new DotCollection().getMaxDistance(mas) >=0)
  }
  test("testMap") {
    val map = Map(1 -> -2, 2 -> 4, 3 -> -2,4 -> 7,5 -> -2,6 -> -2, 7 -> 4)
    val newMap=new Maps().deleteSameElements(map)
    assert(newMap.size <=map.size && newMap.size>0)
  }
}

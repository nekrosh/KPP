import java.util.concurrent.atomic.AtomicInteger

object Main {
  def main(args:Array[String]): Unit = {
    val list:List[Int] = List(5,10,4,-3,1,-3)
    val list1:List[Int] = List(-2,8,4,-12,1,3)
    val map = Map(1 -> -2, 2 -> 4, 3 -> -2,4 -> 7,5 -> -2,6 -> -2, 7 -> 4)
    println(new ListSum().getSum(list))
    println(new DotCollection().getMaxDistance(list1))
    val newMap=new Maps().deleteSameElements(map)
    val iter= newMap.iterator
    while(iter.hasNext) {
      print(iter.next())
      print(' ')
    }
  }
}
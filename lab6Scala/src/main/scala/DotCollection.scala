//21.	Существует набор точек. Найти максимальное расстояние между двумя точками среди точек коллекции.
import java.util.concurrent.atomic.AtomicInteger
class DotCollection {
  def getMaxDistance(list: List[Int]): Int = {
    val iter1 = new AtomicInteger(0)
    val iter2 = new AtomicInteger(iter1.intValue()+1)
    val distance = new AtomicInteger(0)
    val maxDistance = new AtomicInteger(0)
    for(iter1 <-0 to list.length-2) {
      iter2.set(iter1 + 1)
      while (iter2.intValue() < list.length - 1) {
        distance.set(Math.abs(list(iter1.intValue())-list(iter2.intValue())))
        if(maxDistance.intValue()<distance.intValue()) maxDistance.set(distance.intValue())
        iter2.incrementAndGet()
      }
    }
    maxDistance.intValue()
  }

}

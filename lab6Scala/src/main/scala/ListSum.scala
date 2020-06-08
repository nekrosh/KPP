//6. Реализовать функцию, которая подсчитывает сумму всех элементов в List[Int] с использованием fold
import java.util.concurrent.atomic.AtomicInteger
class ListSum {
  def getSum(list:List[Int]): Int = {
    list.fold(0)(_ + _)
  }
}

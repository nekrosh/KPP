import java.util.concurrent.atomic.AtomicInteger

class Unrecursion {
  def findLength(mas: Seq[Int]):Int = {
    val iter = new AtomicInteger(0)
    val length = new AtomicInteger(1)
    val maxLength = new AtomicInteger(1)
    while(iter.intValue()<mas.length-1) {
      if (mas(iter.intValue()) == mas(iter.incrementAndGet())) {
        length.incrementAndGet()
        if (length.intValue() > maxLength.intValue())
          maxLength.set(length.intValue())
      } else {
        length.set(1)
      }
    }
    maxLength.intValue()
  }
}

import scala.annotation.tailrec

object Problem2 {
  // https://projecteuler.net/problem=2

  def problem2(): Int = {
    recursiveFibonnaci(1, 0, 0)
  }

  @tailrec
  private def recursiveFibonnaci(current: Int, prev: Int, evenSum: Int): Int = {
    if (current > 4000000){
      evenSum
    } else if (current % 2 == 0){
      recursiveFibonnaci(current + prev, current, evenSum + current)
    } else {
      recursiveFibonnaci(current + prev, current, evenSum)
    }
  }

}

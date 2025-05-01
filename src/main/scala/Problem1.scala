object Problem1 {

  // https://projecteuler.net/problem=1

  def problem1(): Int = {

    (1 until 1000)
      .filter(x => x % 3 == 0 || x % 5 == 0)
      .sum

  }

}

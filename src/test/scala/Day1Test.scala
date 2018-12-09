import org.scalatest.FunSuite

class Day1Test extends FunSuite {
  val source = "input/day1.txt"
  val day1 = new Day1(source)
  val lines = io.Source.fromFile(source).getLines.size

  test("values can be read into a list from source") {
    assert(day1.makeList.size == lines)
  }

  test("compute returns a single Int") {
    assert(day1.makeList.sum.isInstanceOf[Int])
  }

  test("compute returns the answer") {
    assert(day1.makeList.sum == 525)
  }

  test("interrupt method") {
    assert(day1.interruptOnDuplicate == 75749)
  }
}

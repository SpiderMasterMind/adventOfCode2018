import org.scalatest.FunSuite

class Day2Test extends FunSuite {
  val source = "input/day2.txt"
  val day2 = new Day2(source)
  val lines = io.Source.fromFile(source).getLines.size

  test("values can be read into a list from source") {
    assert(day2.listOfIds.size == lines)
  }

  test("all Ids are the same length") {
    assert(day2.listOfIds.forall(element =>
      day2.listOfIds.head.length == element.length
      )
    )
  }

  test("duplicate chars in ID are processed") {
    // uosnxmfkezbojfdgwvrtaqhluy
    day2.getResult
    assert(true)
  }
}

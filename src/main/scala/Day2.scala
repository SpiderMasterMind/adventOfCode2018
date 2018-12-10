import scala.collection.mutable
import scala.collection.mutable.ListBuffer

class Day2(source: String) {
  val buf = new ListBuffer[String]
  val listOfIds: List[String] = {
    for (line <- io.Source.fromFile(source).getLines) {
      buf += line
    }
    buf.toList
  }

  val id = listOfIds.head
  def getResult = {
    val result = mutable.Map.empty[Char, Int]
    for (char <- id) {
      val prevCount =
        if (result.contains(char)) {
          println(result(char))
          result(char)
        }
        else 0
      result += (char -> (prevCount + 1))
    }
    println(result)
    result
  }
}

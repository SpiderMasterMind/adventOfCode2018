import scala.collection.mutable.ListBuffer

class Day2(source: String) {
    val result = new ListBuffer[String]
    val listOfIds: List[String] = {
      for (line <- io.Source.fromFile(source).getLines) {
        result += line
      }
      result.toList
    }
}

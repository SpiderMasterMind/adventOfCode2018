import scala.collection.mutable.ListBuffer

class Day2(source: String) {
  val buf = new ListBuffer[String]
  val listOfIds: List[String] = {
    for (line <- io.Source.fromFile(source).getLines) {
      buf += line
    }
    buf.toList
  }

  def processIds(list: List[String]): Unit = {
    for (id <- list) {
//      println(buildCharMap(id))
//      buildCharMap(id).foldLeft(0) {
//        case (acc, (k, v)) =>
//          if ( v > 2 ) acc + 1
//      }
    }
  }

  def buildCharMap(id: String): Map[Char, Int] = {
    def go(idString: String, result: Map[Char, Int], idx: Int): Map[Char, Int] = {
      if (idx > idString.length - 1) return result
      else
        for (char <- id) {
          val prevCount =
            if (result.contains(char)) {
              result(char)
            }
            else 0
          val newMap = result + (char -> (prevCount + 1))
        }
      go(idString, result, idx + 1)
    }
    def go(id: String, Map.empty[Char, Int], 0)
  }
}

import scala.annotation.tailrec
import scala.collection.mutable.ListBuffer

class Day1(source: String) {
  println("making list")
  val result = new ListBuffer[Int]

  val makeList: List[Int] = {
    for (line <- io.Source.fromFile(source).getLines) {
      result += line.toInt
    }
    result.toList
  }

  def interruptOnDuplicate: Int = {
    @tailrec
    def go(orig: List[Int], pending: List[Int], processed: List[Int], freq: Int): Int  = {
      if (processed.contains(freq)) {
        freq
      } else if (pending.isEmpty) {
        go(orig, orig.tail, freq :: processed, freq + orig.head)
      } else go(orig, pending.tail, freq :: processed, freq + pending.head)
    }
    go(this.makeList: List[Int], this.makeList: List[Int],  List(), 0)
  }
}



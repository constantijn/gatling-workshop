package feeders

trait StringFeeder {

  def randomString(len: Int): String = scala.util.Random.alphanumeric.take(len).mkString

  val stringFeeder = Iterator.continually(Map("randomString" -> randomString(20)))

}

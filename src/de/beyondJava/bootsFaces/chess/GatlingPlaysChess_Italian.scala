package de.beyondJava.bootsFaces.chess

object GatlingPlaysChess {
  def main(args: Array[String]): Unit = {
    val parameters = Array("-s", "de.beyondJava.bootsFaces.chess.ItalianOpening")
    io.gatling.app.Gatling.main(parameters)
  }
}
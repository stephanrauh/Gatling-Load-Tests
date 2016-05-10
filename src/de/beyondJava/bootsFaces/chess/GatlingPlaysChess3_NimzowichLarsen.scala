package de.beyondJava.bootsFaces.chess

object GatlingPlaysChess3 {
  def main(args: Array[String]): Unit = {
    val parameters = Array("-s", "de.beyondJava.bootsFaces.chess.NimzovichLarsen")
    io.gatling.app.Gatling.main(parameters)
  }
}
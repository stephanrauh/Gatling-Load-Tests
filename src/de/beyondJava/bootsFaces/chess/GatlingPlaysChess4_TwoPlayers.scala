package de.beyondJava.bootsFaces.chess

object GatlingPlaysChess4_TwoPlayers {
  def main(args: Array[String]): Unit = {
    val parameters = Array("-s", "de.beyondJava.bootsFaces.chess.TwoPlayers")
    io.gatling.app.Gatling.main(parameters)
  }
}
package de.beyondJava.bootsFaces.loadTest

object RunGatling {
  def main(args: Array[String]): Unit = {
    println("Hallo Welt!")
    val parameters = Array("-s", "de.beyondJava.bootsFaces.loadTest.RecordedSimulation")
    io.gatling.app.Gatling.main(parameters)
  }
}
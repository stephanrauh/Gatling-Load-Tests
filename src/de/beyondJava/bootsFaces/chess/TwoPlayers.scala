package de.beyondJava.bootsFaces.chess

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class TwoPlayers extends Simulation {

  	val httpProtocol = http
		.baseURL("http://www.angularfaces.net")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png""", """.*\.js.jsf.*"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("de,es;q=0.8,en-US;q=0.6,en;q=0.4,fr-FR;q=0.2,fr;q=0.2,de-DE;q=0.2")
		.doNotTrackHeader("1")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.94 Safari/537.36")


  val italian = new ItalianOpening2().scn;
  val nimzovich = new NimzovichLarsen().scn
	setUp(italian.inject(atOnceUsers(1)),
	      nimzovich.inject(atOnceUsers(1)))
  .protocols(httpProtocol)

}
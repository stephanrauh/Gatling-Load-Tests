package de.beyondJava.bootsFaces.loadTest

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder.toHttpProtocol
import io.gatling.http.request.builder.HttpRequestBuilder.toActionBuilder

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("http://127.0.0.1:8080")
		.inferHtmlResources()
		.acceptHeader("text/css,*/*;q=0.1")
		.acceptEncodingHeader("gzip, deflate, sdch")
		.acceptLanguageHeader("de,es;q=0.8,en-US;q=0.6,en;q=0.4,fr-FR;q=0.2,fr;q=0.2,de-DE;q=0.2")
		.doNotTrackHeader("1")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.94 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"AlexaToolbar-ALX_NS_PH" -> "AlexaToolbar/alx-4.0",
		"Upgrade-Insecure-Requests" -> "1")

    val uri1 = "http://127.0.0.1:8080/BootsFacesWeb"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/BootsFacesWeb/")
			.headers(headers_0)
			.check(status.is(200)))
		.pause(3)
		.exec(http("request_35")
			.get("/BootsFacesWeb/forms/searchExpressions.jsf")
			.headers(headers_0)
			.check(status.is(200)))
		.pause(19)
		.exec(http("request_70")
			.get("/BootsFacesWeb/bootstrap/carousel.jsf")
			.headers(headers_0)
			.check(status.is(200)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
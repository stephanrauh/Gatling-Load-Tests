package de.beyondJava.bootsFaces.chess

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class NimzovichLarsen extends Simulation {

	val httpProtocol = http
		.baseURL("http://127.0.0.1:8080")
		.inferHtmlResources(BlackList(""".*js\.jsf.*""", """.*css\.jsf.*""", """.*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.(t|o)tf""", """.*\.png"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("de,es;q=0.8,en-US;q=0.6,en;q=0.4,fr-FR;q=0.2,fr;q=0.2,de-DE;q=0.2")
		.doNotTrackHeader("1")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_4) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/50.0.2661.94 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, sdch",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Faces-Request" -> "partial/ajax",
		"Origin" -> "http://127.0.0.1:8080")

    val uri1 = "http://127.0.0.1:8080/BootsFacesChess"

	val scn = scenario("NimzovichLarsen")
		.exec(http("request_0")
			.get("/BootsFacesChess/")
			.headers(headers_0))
		.pause(2)
		.exec(http("request_1")
			.post("/BootsFacesChess/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:6:fields:1:j_id_n", "form:rows:6:fields:1:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:6:fields:1:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form")
			.resources(http("request_2")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form"),
            http("request_3")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:5:fields:1:j_id_n", "form:rows:5:fields:1:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:5:fields:1:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form"),
            http("request_4")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form")))
		.pause(1)
		.exec(http("request_5")
			.post("/BootsFacesChess/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:7:fields:2:j_id_n", "form:rows:7:fields:2:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:7:fields:2:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form")
			.resources(http("request_6")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form"),
            http("request_7")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:6:fields:1:j_id_n", "form:rows:6:fields:1:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:6:fields:1:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form"),
            http("request_8")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form")))
		.pause(1)
		.exec(http("request_9")
			.post("/BootsFacesChess/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:7:fields:6:j_id_n", "form:rows:7:fields:6:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:7:fields:6:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form")
			.resources(http("request_10")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form"),
            http("request_11")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:5:fields:5:j_id_n", "form:rows:5:fields:5:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:5:fields:5:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form"),
            http("request_12")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form")))
		.pause(1)
		.exec(http("request_13")
			.post("/BootsFacesChess/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:6:fields:2:j_id_n", "form:rows:6:fields:2:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:6:fields:2:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form")
			.resources(http("request_14")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form"),
            http("request_15")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:4:fields:2:j_id_n", "form:rows:4:fields:2:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:4:fields:2:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form"),
            http("request_16")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form")))
		.pause(1)
		.exec(http("request_17")
			.post("/BootsFacesChess/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:5:fields:1:j_id_n", "form:rows:5:fields:1:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:5:fields:1:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form")
			.resources(http("request_18")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form"),
            http("request_19")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:4:fields:2:j_id_n", "form:rows:4:fields:2:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:4:fields:2:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form"),
            http("request_20")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form")))
		.pause(1)
		.exec(http("request_21")
			.post("/BootsFacesChess/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:6:fields:3:j_id_n", "form:rows:6:fields:3:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:6:fields:3:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form")
			.resources(http("request_22")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form")))
		.pause(1)
		.exec(http("request_23")
			.post("/BootsFacesChess/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:5:fields:3:j_id_n", "form:rows:5:fields:3:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:5:fields:3:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form")
			.resources(http("request_24")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form")))
		.pause(1)
		.exec(http("request_25")
			.post("/BootsFacesChess/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:6:fields:4:j_id_n", "form:rows:6:fields:4:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:6:fields:4:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form")
			.resources(http("request_26")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form"),
            http("request_27")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("params", "BsFEvent=click")
			.formParam("form:rows:4:fields:4:j_id_n", "form:rows:4:fields:4:j_id_n")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:rows:4:fields:4:j_id_n")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form messages")
			.formParam("form", "form"),
            http("request_28")
			.post(uri1 + "/index.jsf")
			.headers(headers_1)
			.formParam("input_form:j_id_y", "5")
			.formParam("input_form:j_id_10", "6")
			.formParam("form:j_id_12_helper", "on")
			.formParam("form_SUBMIT", "1")
			.formParam("javax.faces.ViewState", "PLWXhcqXBG4PI3fL68fMqxOp1Pg9KV3Nzv14GQ0BajnpIGuk")
			.formParam("form:opponent", "form:opponent")
			.formParam("javax.faces.partial.event", "click")
			.formParam("javax.faces.source", "form:opponent")
			.formParam("javax.faces.partial.ajax", "true")
			.formParam("javax.faces.partial.execute", "form")
			.formParam("javax.faces.partial.render", "form")
			.formParam("form", "form")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
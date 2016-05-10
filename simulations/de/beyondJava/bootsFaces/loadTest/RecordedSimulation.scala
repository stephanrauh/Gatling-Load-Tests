package de.beyondJava.bootsFaces.loadTest

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

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

	val headers_1 = Map("AlexaToolbar-ALX_NS_PH" -> "AlexaToolbar/alx-4.0")

	val headers_11 = Map(
		"Accept" -> "*/*",
		"AlexaToolbar-ALX_NS_PH" -> "AlexaToolbar/alx-4.0")

	val headers_33 = Map(
		"Accept" -> "image/webp,image/*,*/*;q=0.8",
		"AlexaToolbar-ALX_NS_PH" -> "AlexaToolbar/alx-4.0")

	val headers_34 = Map(
		"Accept" -> "*/*",
		"AlexaToolbar-ALX_NS_PH" -> "AlexaToolbar/alx-4.0",
		"Origin" -> "http://127.0.0.1:8080")

    val uri1 = "http://127.0.0.1:8080/BootsFacesWeb"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/BootsFacesWeb/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri1 + "/javax.faces.resource/theme.css.jsf?ln=primefaces-bootstrap")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_2")
			.get(uri1 + "/javax.faces.resource/first.css.jsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_3")
			.get(uri1 + "/javax.faces.resource/css/shCore.css.jsf?ln=sh")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_4")
			.get(uri1 + "/javax.faces.resource/css/shCoreEclipse.css.jsf?ln=sh")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_5")
			.get(uri1 + "/javax.faces.resource/middle.css.jsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_6")
			.get(uri1 + "/javax.faces.resource/css/default/bsf.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_7")
			.get(uri1 + "/javax.faces.resource/css/default/theme.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_8")
			.get(uri1 + "/javax.faces.resource/last.css.jsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_9")
			.get(uri1 + "/javax.faces.resource/css/default/tooltip.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_10")
			.get(uri1 + "/javax.faces.resource/css/default/scrollup.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_11")
			.get(uri1 + "/javax.faces.resource/jq/jquery.js.jsf?ln=bsf")
			.headers(headers_11),
            http("request_12")
			.get(uri1 + "/javax.faces.resource/css/default/dropdowns.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_13")
			.get(uri1 + "/javax.faces.resource/css/default/dropdown-submenu.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_14")
			.get(uri1 + "/javax.faces.resource/css/default/jumbotron.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_15")
			.get(uri1 + "/javax.faces.resource/css/default/navbar.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_16")
			.get(uri1 + "/javax.faces.resource/js/jquery.scrollUp.min.js.jsf?ln=bsf")
			.headers(headers_11),
            http("request_17")
			.get(uri1 + "/javax.faces.resource/js/shCore.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_18")
			.get(uri1 + "/javax.faces.resource/css/default/modals.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_19")
			.get(uri1 + "/javax.faces.resource/css/icons.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_20")
			.get(uri1 + "/javax.faces.resource/css/default/panels.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_21")
			.get(uri1 + "/javax.faces.resource/js/shBrushCss.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_22")
			.get(uri1 + "/javax.faces.resource/css/default/core.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_23")
			.get(uri1 + "/javax.faces.resource/js/shBrushJava.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_24")
			.get(uri1 + "/javax.faces.resource/jsf.js.jsf?ln=javax.faces&stage=Development")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_25")
			.get(uri1 + "/javax.faces.resource/js/shBrushXml.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_26")
			.get(uri1 + "/javax.faces.resource/js/tooltip.js.jsf?ln=bsf")
			.headers(headers_11),
            http("request_27")
			.get(uri1 + "/javax.faces.resource/js/bsf.js.jsf?ln=bsf")
			.headers(headers_11),
            http("request_28")
			.get(uri1 + "/javax.faces.resource/js/shBrushGroovy.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_29")
			.get(uri1 + "/javax.faces.resource/js/shBrushJScript.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_30")
			.get(uri1 + "/javax.faces.resource/js/collapse.js.jsf?ln=bsf")
			.headers(headers_11),
            http("request_31")
			.get(uri1 + "/javax.faces.resource/js/dropdown.js.jsf?ln=bsf")
			.headers(headers_11),
            http("request_32")
			.get(uri1 + "/javax.faces.resource/js/modal.js.jsf?ln=bsf")
			.headers(headers_11),
            http("request_33")
			.get(uri1 + "/javax.faces.resource/top.png.jsf?ln=images")
			.headers(headers_33)
			.check(status.is(304))))
		.pause(23)
		.exec(http("request_34")
			.get("/BootsFacesWeb/fonts/glyphicons-halflings-regular.woff2")
			.headers(headers_34))
		.pause(3)
		.exec(http("request_35")
			.get("/BootsFacesWeb/forms/searchExpressions.jsf")
			.headers(headers_0)
			.resources(http("request_36")
			.get(uri1 + "/javax.faces.resource/theme.css.jsf?ln=primefaces-bootstrap")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_37")
			.get(uri1 + "/javax.faces.resource/first.css.jsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_38")
			.get(uri1 + "/javax.faces.resource/css/shCoreEclipse.css.jsf?ln=sh")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_39")
			.get(uri1 + "/javax.faces.resource/css/shCore.css.jsf?ln=sh")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_40")
			.get(uri1 + "/javax.faces.resource/middle.css.jsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_41")
			.get(uri1 + "/javax.faces.resource/css/default/bsf.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_42")
			.get(uri1 + "/javax.faces.resource/css/default/theme.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_43")
			.get(uri1 + "/javax.faces.resource/jq/jquery.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_44")
			.get(uri1 + "/javax.faces.resource/last.css.jsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_45")
			.get(uri1 + "/javax.faces.resource/css/default/scrollup.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_46")
			.get(uri1 + "/javax.faces.resource/css/default/tooltip.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_47")
			.get(uri1 + "/javax.faces.resource/css/default/core.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_48")
			.get(uri1 + "/javax.faces.resource/css/default/navbar.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_49")
			.get(uri1 + "/javax.faces.resource/css/default/dropdowns.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_50")
			.get(uri1 + "/javax.faces.resource/css/default/dropdown-submenu.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_51")
			.get(uri1 + "/javax.faces.resource/css/default/wells.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_52")
			.get(uri1 + "/javax.faces.resource/css/default/badges.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_53")
			.get(uri1 + "/javax.faces.resource/css/default/bootstrap-treeview.min.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_54")
			.get(uri1 + "/javax.faces.resource/css/default/panels.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_55")
			.get(uri1 + "/javax.faces.resource/js/jquery.scrollUp.min.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_56")
			.get(uri1 + "/javax.faces.resource/css/icons.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_57")
			.get(uri1 + "/javax.faces.resource/js/shCore.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_58")
			.get(uri1 + "/javax.faces.resource/js/shBrushCss.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_59")
			.get(uri1 + "/javax.faces.resource/js/shBrushXml.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_60")
			.get(uri1 + "/javax.faces.resource/js/shBrushJava.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_61")
			.get(uri1 + "/javax.faces.resource/js/shBrushGroovy.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_62")
			.get(uri1 + "/javax.faces.resource/js/shBrushJScript.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_63")
			.get(uri1 + "/javax.faces.resource/jsf.js.jsf?ln=javax.faces&stage=Development")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_64")
			.get(uri1 + "/javax.faces.resource/js/tooltip.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_65")
			.get(uri1 + "/javax.faces.resource/js/tab.js.jsf?ln=bsf")
			.headers(headers_11),
            http("request_66")
			.get(uri1 + "/javax.faces.resource/js/bsf.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_67")
			.get(uri1 + "/javax.faces.resource/js/collapse.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_68")
			.get(uri1 + "/javax.faces.resource/js/dropdown.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_69")
			.get(uri1 + "/javax.faces.resource/top.png.jsf?ln=images")
			.headers(headers_33)
			.check(status.is(304))))
		.pause(19)
		.exec(http("request_70")
			.get("/BootsFacesWeb/bootstrap/carousel.jsf")
			.headers(headers_0)
			.resources(http("request_71")
			.get(uri1 + "/javax.faces.resource/theme.css.jsf?ln=primefaces-bootstrap")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_72")
			.get(uri1 + "/javax.faces.resource/first.css.jsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_73")
			.get(uri1 + "/javax.faces.resource/css/shCoreEclipse.css.jsf?ln=sh")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_74")
			.get(uri1 + "/javax.faces.resource/css/shCore.css.jsf?ln=sh")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_75")
			.get(uri1 + "/javax.faces.resource/css/default/bsf.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_76")
			.get(uri1 + "/javax.faces.resource/middle.css.jsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_77")
			.get(uri1 + "/javax.faces.resource/css/default/theme.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_78")
			.get(uri1 + "/javax.faces.resource/css/default/carousel.css.jsf?ln=bsf")
			.headers(headers_1),
            http("request_79")
			.get(uri1 + "/javax.faces.resource/last.css.jsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_80")
			.get(uri1 + "/javax.faces.resource/css/default/tooltip.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_81")
			.get(uri1 + "/javax.faces.resource/jq/jquery.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_82")
			.get(uri1 + "/javax.faces.resource/css/default/scrollup.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_83")
			.get(uri1 + "/javax.faces.resource/css/default/core.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_84")
			.get(uri1 + "/javax.faces.resource/css/default/navbar.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_85")
			.get(uri1 + "/javax.faces.resource/css/default/dropdown-submenu.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_86")
			.get(uri1 + "/javax.faces.resource/css/default/dropdowns.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_87")
			.get(uri1 + "/javax.faces.resource/css/default/wells.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_88")
			.get(uri1 + "/javax.faces.resource/css/default/bootstrap-treeview.min.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_89")
			.get(uri1 + "/javax.faces.resource/css/default/panels.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_90")
			.get(uri1 + "/javax.faces.resource/css/default/badges.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_91")
			.get(uri1 + "/javax.faces.resource/js/shCore.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_92")
			.get(uri1 + "/javax.faces.resource/js/jquery.scrollUp.min.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_93")
			.get(uri1 + "/javax.faces.resource/js/shBrushCss.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_94")
			.get(uri1 + "/javax.faces.resource/css/icons.css.jsf?ln=bsf")
			.headers(headers_1)
			.check(status.is(304)),
            http("request_95")
			.get(uri1 + "/javax.faces.resource/js/carousel.js.jsf?ln=bsf")
			.headers(headers_11),
            http("request_96")
			.get(uri1 + "/javax.faces.resource/js/shBrushXml.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_97")
			.get(uri1 + "/javax.faces.resource/js/shBrushJava.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_98")
			.get(uri1 + "/javax.faces.resource/js/shBrushJScript.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_99")
			.get(uri1 + "/javax.faces.resource/js/shBrushGroovy.js.jsf?ln=sh")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_100")
			.get(uri1 + "/javax.faces.resource/jq/ui/core.js.jsf?ln=bsf")
			.headers(headers_11),
            http("request_101")
			.get(uri1 + "/javax.faces.resource/js/tab.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_102")
			.get(uri1 + "/javax.faces.resource/jsf.js.jsf?ln=javax.faces&stage=Development")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_103")
			.get(uri1 + "/javax.faces.resource/js/tooltip.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_104")
			.get(uri1 + "/javax.faces.resource/js/bsf.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_105")
			.get(uri1 + "/javax.faces.resource/js/collapse.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_106")
			.get(uri1 + "/javax.faces.resource/js/dropdown.js.jsf?ln=bsf")
			.headers(headers_11)
			.check(status.is(304)),
            http("request_107")
			.get(uri1 + "/bootstrap/carousel/Valladolid-parque-1.jpg")
			.headers(headers_33)
			.check(status.is(304)),
            http("request_108")
			.get(uri1 + "/bootstrap/carousel/Valladolid-parque-2.jpg")
			.headers(headers_33)
			.check(status.is(304)),
            http("request_109")
			.get(uri1 + "/bootstrap/carousel/Valladolid-parque-3.jpg")
			.headers(headers_33)
			.check(status.is(304)),
            http("request_110")
			.get(uri1 + "/bootstrap/Valladolid2.png")
			.headers(headers_33)
			.check(status.is(304)),
            http("request_111")
			.get(uri1 + "/bootstrap/Valladolid1.png")
			.headers(headers_33)
			.check(status.is(304)),
            http("request_112")
			.get(uri1 + "/bootstrap/Valladolid3.png")
			.headers(headers_33)
			.check(status.is(304)),
            http("request_113")
			.get(uri1 + "/bootstrap/carousel/rioja1.jpg")
			.headers(headers_33)
			.check(status.is(304)),
            http("request_114")
			.get(uri1 + "/bootstrap/Valladolid5.png")
			.headers(headers_33)
			.check(status.is(304)),
            http("request_115")
			.get(uri1 + "/bootstrap/Valladolid4.png")
			.headers(headers_33)
			.check(status.is(304)),
            http("request_116")
			.get(uri1 + "/bootstrap/carousel/rioja2.jpg")
			.headers(headers_33)
			.check(status.is(304)),
            http("request_117")
			.get(uri1 + "/bootstrap/carousel/rioja3.jpg")
			.headers(headers_33)
			.check(status.is(304)),
            http("request_118")
			.get(uri1 + "/javax.faces.resource/top.png.jsf?ln=images")
			.headers(headers_33)
			.check(status.is(304))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}
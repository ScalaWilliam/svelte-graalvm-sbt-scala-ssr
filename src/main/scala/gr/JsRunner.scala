package gr

import org.graalvm.polyglot.{Context, HostAccess, Source}

import java.io.{InputStreamReader, Reader}

object JsRunner {

  def makeHtml(str: String): String = {
    val context = Context.newBuilder("js").allowIO(true).option("js.esm-eval-returns-exports", "true")
      .allowHostAccess(HostAccess.ALL)
      .allowHostClassLookup(_ => true)
      .allowExperimentalOptions(true).build
    try {
      val source = Source.newBuilder("js", new InputStreamReader(getClass.getResourceAsStream("s.mjs")): Reader, "s.mjs").mimeType("application/javascript+module").build
      val exports = context.eval(source)
      exports.getMember("Food").newInstance().invokeMember("makeMe", SomeClass(str)).toString
    } finally context.close()
  }

}

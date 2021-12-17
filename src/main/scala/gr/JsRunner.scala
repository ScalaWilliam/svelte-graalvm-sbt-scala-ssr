package gr

import org.graalvm.polyglot.{Context, Source}
import java.io.{InputStreamReader, Reader}

object JsRunner extends App {
  def makeHtml(str: String): String = {
    val context = Context.newBuilder("js").allowIO(true).option("js.esm-eval-returns-exports", "true")
      .allowExperimentalOptions(true).build
    try {
      val source = Source.newBuilder("js", new InputStreamReader(getClass.getResourceAsStream("s.mjs")): Reader, "s.mjs").mimeType("application/javascript+module").build
      val exports = context.eval(source)
      exports.getMember("Foo").newInstance().invokeMember("makeMe", str).toString
    } finally context.close()
  }
}

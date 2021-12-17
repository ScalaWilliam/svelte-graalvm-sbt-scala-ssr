package gr

import org.scalatest.freespec.AnyFreeSpec

final class JsRunnerSpec extends AnyFreeSpec {
  "It works" in {
    assert(JsRunner.makeHtml("x") == "<b>x!</b>")
  }
}
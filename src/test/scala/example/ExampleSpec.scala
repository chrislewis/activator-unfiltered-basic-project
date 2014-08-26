package example

import dispatch.classic._
import org.specs2.mutable.Specification

object ExampleSpec extends Specification with unfiltered.specs2.jetty.Served {

  def setup = { _.plan(Example) }

  val http = new Http

  "The example app" should {
    "serve unfiltered requests" in {
      val status = http x (host as_str) {
        case (code, _, _, _) => code
      }
      status must_== 200
    }
  }
}

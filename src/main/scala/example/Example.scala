package example

import unfiltered.filter.Plan
import unfiltered.request._
import unfiltered.response._

object Example extends Plan {
  def intent = {
    case GET(Path(p)) => Ok ~> ResponseString(s"Path requested: $p")
  }
}

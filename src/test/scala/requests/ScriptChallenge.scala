package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

trait ScriptChallenge {

  val openStartPage = exec(http("Open the challenge start page.")
    .get("/")
    .check(status.is(200))
  )

}

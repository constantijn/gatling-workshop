package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

trait ScriptChallenge {

  val openStartPage = exec(http("Open the challenge start page.")
    .get("/start")
    .check(status.is(200))
    .check(css("#challenger_step_id", "value").saveAs("challengerStepId"))
    .check(css("input[name='authenticity_token']", "value").saveAs("authenticityToken"))
    .check(css("#challenger_step_number", "value").saveAs("challengerStepNumber"))
    .check(css("input[name='commit']", "value").saveAs("commitStage"))
  )

}

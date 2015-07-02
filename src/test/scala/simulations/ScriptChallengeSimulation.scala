package simulations

import config.HttpConfig
import io.gatling.core.Predef._
import io.gatling.http.Predef._
import requests.ScriptChallenge
import scala.concurrent.duration._

class ScriptChallengeSimulation extends Simulation with HttpConfig with ScriptChallenge {

  val scriptChallengeScenario = scenario("Open the start page").exec(openStartPage)

  setUp(scriptChallengeScenario.inject(atOnceUsers(10)).protocols(httpProtocol))


}

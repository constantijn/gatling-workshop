package simulations

import config.HttpConfig
import io.gatling.core.Predef._
import requests.ComputerDatabase
import scala.concurrent.duration._

class Exercise1Simulation extends Simulation with HttpConfig {

  val exercise1Scenario = scenario("Exercise 1 - Computer database")
    .exec(ComputerDatabase.addComputer)

  setUp(exercise1Scenario.inject(
    atOnceUsers(1)
  ).protocols(httpProtocolComputerDatabase))


}

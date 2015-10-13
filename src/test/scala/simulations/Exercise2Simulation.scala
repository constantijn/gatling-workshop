package simulations

import config.HttpConfig
import io.gatling.core.Predef._
import requests.ComputerDatabase

class Exercise2Simulation extends Simulation with HttpConfig {


  val exercise2Scenario = scenario("Exercise 2 - Flood.io script challenge")


  setUp(exercise2Scenario.inject(
    atOnceUsers(1)
  ).protocols(httpProtocolFlood))


}

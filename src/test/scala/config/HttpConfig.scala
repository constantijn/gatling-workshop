package config

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._


trait HttpConfig extends Simulation with Environment {

  val httpProtocolComputerDatabase = http
    .baseURL(computerDatabaseEnv)
    .contentTypeHeader("application/json")
    .userAgentHeader("Gatling!")

  val httpProtocolFlood = http
    .baseURL(floodIOEnv)
    .contentTypeHeader("application/json")
    .userAgentHeader("Gatling!")


}

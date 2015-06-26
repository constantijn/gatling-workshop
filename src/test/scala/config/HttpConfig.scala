package config

import io.gatling.core.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.http.Predef._


trait HttpConfig extends Simulation with Environment {

  val env = http.baseURL(environment)

  val httpProtocol = http
    .baseURL(environment)
    .contentTypeHeader("application/json")
    .userAgentHeader("Gatling!")

}

package config

import scala.util.Properties

trait Environment {

  val computerDatabaseEnv = Properties.envOrElse("COMPUTER_DATABASE_HOST", "http://computer-database.gatling.io")
  val floodIOEnv = Properties.envOrElse("FLOOD_IO_HOST", "https://challengers.flood.io")

}

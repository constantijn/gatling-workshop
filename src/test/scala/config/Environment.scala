package config

import scala.util.Properties

trait Environment {

  val environment = Properties.envOrElse("INTEGRATION_HOST", "https://challengers.flood.io")

}

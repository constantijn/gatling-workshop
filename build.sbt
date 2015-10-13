enablePlugins(GatlingPlugin)

name := "gatling-workshop"

scalaVersion := "2.11.7"

scalacOptions := Seq(
  "-encoding", "UTF-8", "-target:jvm-1.7", "-deprecation",
  "-feature", "-unchecked", "-language:implicitConversions", "-language:postfixOps")

val gatlingVersion = "2.1.7"

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion % "test"
libraryDependencies += "io.gatling"            % "gatling-test-framework"    % gatlingVersion % "test"
libraryDependencies += "io.gatling" % "gatling-bundle" % gatlingVersion % "test" artifacts Artifact("gatling-bundle", "zip", "zip", "bundle")

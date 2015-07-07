gatling-workshop
================

Machine setup
-------------

Download and install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

Download and install [SBT](http://www.scala-sbt.org/download.html)

In IntelliJ, add the SBT and Scala plugins

Running tests
-------------
Tests can be run using SBT

`sbt test`

or

`sbt 'testOnly *ScriptChallengeSimulation*`

Viewing reports
---------------
View the last report using

`sbt lastReport`

Or look in the target directory for all previous reports.

Debugging tests
---------------
Info about how to debug failing tests goes here

More information
----------------
[Consult the Gatling documentation here](http://gatling.io/#/docs)


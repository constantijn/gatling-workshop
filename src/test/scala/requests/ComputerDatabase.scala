package requests

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object ComputerDatabase {

  val openStartPage = exec(http("Open the computer database")
    .get("/computers")
    .check(status.is(200)
    )
  )

  //For the first exercise, finish the following requests by adding the correct request body, and validating the correct http return status.
  //Keep in mind that you have to be able to update the computer that you added later on.
  val addComputer = exec(http("Add a computer to the database")
  .post("/computers")
  .body(StringBody(""))

  )

  //The second step would be to update the existing computer, by changing the name to a random value
  //Make sure you validate that the update was performed successfully
  val updateComputer = exec(http("Update an existing computer")
  .post("")

  )

  //Delete the computer after updating
  val deleteComputer = exec(http("Delete an existing computer")
  .post("")

  )


}

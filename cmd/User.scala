import akka.actor.Actor

class UserActor extends Actor {
  def receive = {
    case "startuser" => 
        println("starting napoca user")
        //Add Napoca host code
    case "stopuser" => 
        println("stopping napoca user")
        //Add Napoca host code
    case "adduser" => 
        println("add napoca user")
        //Add Napoca host code
    case "removeuser" => 
        println("remove napoca user")
        //Add Napoca host code
    // case object config -> start user
    case _       => 
        println("not found")
  }
}

import akka.actor.Actor

class HostActor extends Actor {
  def receive = {
    case "startvm" => 
        println("starting napoca vm")
        //Add Napoca host code
    case "stopvm" => 
        println("stopping napoca vm")
        //Add Napoca host code
    // case object config -> start vm
     
    case _       => 
        println("not found")
  }
}

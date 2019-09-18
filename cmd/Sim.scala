import akka.actor.Actor

class SimActor extends Actor {
  def receive = {
    case "startsim" => 
        println("starting napoca sim")
        //Add Napoca host code
    case "stopsim" => 
        println("stopping napoca sim")
        //Add Napoca host code
    // case object config -> start sim
     
    case _       => 
        println("not found")
  }
}

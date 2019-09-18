import akka.actor.Actor

class StatsActor extends Actor {
  def receive = {
    case "startstat" => 
        println("starting napoca stat")
        //Add Napoca host code
    case "stopstat" => 
        println("stopping napoca stat")
        //Add Napoca host code
    case "addstat" => 
        println("stopping napoca stat")
        //Add Napoca host code
    case "addstat" => 
        println("stopping napoca stat")
        //Add Napoca host code
    // case object config -> start stat
     
    case _       => 
        println("not found")
  }
}

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

object Main extends App {
  //probably manage all these as separate actor systems?
  //https://doc.akka.io/api/akka/current/akka/actor/ActorSystem.html

  val system = ActorSystem("napoka-cli")

  // default Actor constructor
  val hostActor = system.actorOf(Props[HostActor], name = "host")
  hostActor ! "startvm"
  hostActor ! "asohdajh"
}
// import play.api.mvc._
// import akka.actor._
// import javax.inject._


// import com.terainsights.napoca


// import akka.pattern.ask
// import scala.concurrent.duration._
// import akka.util.Timeout




// import actors._

// @Singleton
// class Application @Inject() (system: ActorSystem, cc: ControllerComponents) extends AbstractController(cc) {
//   val scheduler = system.actorOf(SchedulerActor.props, "scheduler-actor")

//   implicit val ec: scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
//   implicit val timeout: Timeout = 5.seconds

//   def sayHello(name: String) = Action.async {
//     (scheduler ? SchedulerActor.SayHello(name)).mapTo[String].map { message =>
//       Ok(message)
//     }
//   }
  
  
// }
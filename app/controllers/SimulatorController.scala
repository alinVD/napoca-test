package controllers

import javax.inject._
import akka.actor._

import play.api.libs.json.Json
import play.api.mvc._

import com.terainsights.napoca._

import akka.pattern.ask
import scala.concurrent.duration._
import akka.util.Timeout

import actors.SchedulerActor


@Singleton
class SimulatorController @Inject()(system: ActorSystem, cc: ControllerComponents) extends AbstractController(cc) {
  val scheduler = system.actorOf(SchedulerActor.props, "scheduler-actor")

  implicit val ec: scala.concurrent.ExecutionContext = scala.concurrent.ExecutionContext.global
  implicit val timeout: Timeout = 5.seconds


  def sayHello = Action.async {
    val name = "bruh"
    (scheduler ? SchedulerActor.SayHello(name)).mapTo[String].map { message =>
      Ok(Json.obj("content" -> message))
    }
  }

  def start = Action {
    scheduler ! SchedulerActor.StartSimulator()
    Ok(Json.obj("content" -> "simulation started"))
  }


}

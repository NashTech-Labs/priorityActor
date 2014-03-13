package com.knoldus

import akka.actor.ActorSystem
import akka.actor.Props
import com.typesafe.config.ConfigFactory

object PriorityTestApplication extends App {

  val system = ActorSystem("priority", ConfigFactory.load)

  val myPriorityActor = system.actorOf(Props[MyPriorityActor].withDispatcher("prio-dispatcher"))

  // send messages to actor

  myPriorityActor ! 6.0
  myPriorityActor ! 1
  myPriorityActor ! 5.0
  myPriorityActor ! 3
  myPriorityActor ! "Hello"
  myPriorityActor ! 5
  myPriorityActor ! "I am priority actor"
  myPriorityActor ! "I process string messages first,then integer, long and others"

}
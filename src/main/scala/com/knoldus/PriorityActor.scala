package com.knoldus

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.dispatch.UnboundedPriorityMailbox
import com.typesafe.config.Config
import akka.dispatch.PriorityGenerator

class MyPriorityActor extends Actor {

  def receive: PartialFunction[Any, Unit] = {

    // Int Messages
    case x: Int => println(x)
    // String Messages
    case x: String => println(x)
    // Long messages
    case x: Long => println(x)
    // other messages
    case x => println(x)
  }

}

class MyPriorityActorMailbox(settings: ActorSystem.Settings, config: Config) extends UnboundedPriorityMailbox(
  // Create a new PriorityGenerator, lower prio means more important
  PriorityGenerator {

    // Int Messages
    case x: Int => 1
    // String Messages
    case x: String => 0
    // Long messages
    case x: Long => 2
    // other messages
    case _ => 3
  })

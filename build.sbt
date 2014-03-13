name := "priorityActor"

version := "0.1"

scalaVersion := "2.10.3"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")


// Add multiple dependencies
libraryDependencies ++= Seq(
	"com.typesafe.akka" 	%% 	"akka-actor" 		%	"2.2.3"
)


name := """Hello Test #1"""

version := "1.0-SNAPSHOT"

resolvers += Resolver.sonatypeRepo("snapshots")
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

scalaVersion :=  "2.11.12" //"2.12.8"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.25"

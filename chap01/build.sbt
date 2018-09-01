scalaVersion := "2.12.6"

name := "hello-world"
organization := "ch.epfl.scala"
version := "1.0"


libraryDependencies += "org.typelevel" %% "cats-core" % "1.1.0"
scalacOptions ++= Seq(
    "-Xfatal-warnings",
    "-Ypartial-unification"
)

mainClass := Some("Main")
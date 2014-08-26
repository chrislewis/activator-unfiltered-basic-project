organization := "example"

name := "basic-unfiltered-project"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies ++= Seq(
  "net.databinder" %% "unfiltered-filter" % "0.8.1",
  "net.databinder" %% "unfiltered-jetty" % "0.8.1",
  "net.databinder" %% "unfiltered-specs2" % "0.8.1" % "test"
)

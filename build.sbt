import Dependencies._

enablePlugins(GatlingPlugin)

lazy val root = (project in file("."))
  .settings(
    inThisBuild(List(
      organization := "com.VA",
      scalaVersion := "2.12.9",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "test",
    libraryDependencies ++= gatling
  )

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.1"
//scalaVersion:= "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "ReactiveStreamProcessingEngine",
    idePackagePrefix := Some("org.starrypixel.distributed")
  )

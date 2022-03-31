lazy val root = (project in file(".")).settings(
  organization := "test",
  scalaVersion := "3.1.1",
  name := "inline-test",
  version := "0.0.1",
  scalacOptions := Seq(
    "-deprecation",
    "-feature",
    "-language:postfixOps",
    "-language:implicitConversions",
    "-language:higherKinds",
    "-Xfatal-warnings"
  ),
  Test / parallelExecution := false,
  Compile / mappings := Seq(),
  packageDoc / mappings := Seq(),
  packageDoc / publishArtifact := false
)

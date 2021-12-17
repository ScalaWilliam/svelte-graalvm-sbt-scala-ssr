scalaVersion := "2.13.7"

libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.2.10" % Test,
  "org.graalvm.js" % "js" % "21.3.0",
  "org.graalvm.js" % "js-scriptengine" % "21.3.0",
  "org.graalvm.sdk" % "graal-sdk" % "21.3.0"
)

Global / onChangedBuildSource := ReloadOnSourceChanges

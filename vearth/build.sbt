lazy val root = (project in file(".")).
  settings(
    name := "vearth",
    version := "1.0",
    scalaVersion := "2.11.2",
    libraryDependencies ++= Seq(
      "org.scala-lang" % "scala-swing" % "2.9.0-1"
    )
  )

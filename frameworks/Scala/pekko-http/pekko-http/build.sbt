enablePlugins(JavaAppPackaging)

organization := "org.apache.pekko"

name := "pekko-http-benchmark"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.16"

val pekkoV = "1.2.0"
val pekkoHttpV = "1.2.0"

libraryDependencies ++= Seq(
  "org.apache.pekko" %% "pekko-http" % pekkoHttpV,
  "org.apache.pekko" %% "pekko-stream" % pekkoV,
  "com.github.pjfanning" %% "pekko-http-jsoniter-scala" % "3.0.0",
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % "2.31.0",
  "mysql" % "mysql-connector-java" % "8.0.33",
  "com.zaxxer" % "HikariCP" % "6.0.0",
  "org.scalatra.scalate" %% "scalate-core" % "1.10.1",
  "org.scalatest" %% "scalatest" % "3.2.19" % "test"
)

Compile / mainClass := Some("pekko.http.benchmark.Main")

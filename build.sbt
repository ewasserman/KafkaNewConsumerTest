name := "newkafkaconsumer"

version := "0.0.1"

scalaVersion := "2.11.8"

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")

resolvers += "Typesafe Simple Repository" at "http://repo.typesafe.com/typesafe/simple/maven-releases/"
resolvers += "Artifactory Realm" at "http://artifactory.sgn.com/artifactory/repo"

libraryDependencies ++= {
  lazy val akkaVersion = "2.4.16"
  lazy val akkaHttpVersion = "10.0.1"
  Seq(
    "ch.qos.logback"               % "logback-classic"        % "1.1.9", // Logback with slf4j facade
    "org.slf4j"                    % "slf4j-api"              % "1.7.22",
    "org.apache.kafka"             % "kafka-clients"          % "0.10.0.0",
    "com.jamcity"                  % "avro-codec"             % "0.0.4",
    "org.apache.commons"           % "commons-lang3"          % "3.5",
    "com.jsuereth"                %% "scala-arm"              % "1.4",
    "org.scalatest"               %% "scalatest"              % "2.2.6"     % "test"
  )
}

// -------------------
// sbt-native packager
// -------------------

// add plugins needed for sbt-native-packager
lazy val `newkafkaconsumer` = (project in file(".")).
  enablePlugins(JavaAppPackaging).
  enablePlugins(UniversalDeployPlugin).
  enablePlugins(RpmPlugin)

mainClass in assembly := Some("jamcity.NewConsumerTest")
name := "url-normalization"

version := "0.1-SNAPSHOT"

organization := "com.naytev"

scalaVersion := "2.11.4"

crossScalaVersions := Seq("2.10.4")

lazy val project = Project ( "url-normalization", file("."), settings = Defaults.defaultSettings)

libraryDependencies ++= Seq(
  "log4j" % "log4j" % "1.2.17",
  "commons-collections" % "commons-collections" % "3.2.1",
  "org.apache.commons" % "commons-lang3" % "3.1",
  "com.novocode" % "junit-interface" % "0.11" % Test,
  "junit" % "junit" % "4.10" % Test
)


publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pgpReadOnly := false

licenses := Seq("Apache 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

homepage := Some(url("https://github.com/naytev/url-normalization"))

pomExtra := (
  <scm>
    <url>git://github.com/naytev/url-normalization.git</url>
    <connection>scm:git://github.com/naytev/url-normalization.git</connection>
  </scm>
  <developers>
    <developer>
      <id>mbseid</id>
      <name>Michael Seid</name>
      <url>http://github.com/mbseid</url>
    </developer>
  </developers>)

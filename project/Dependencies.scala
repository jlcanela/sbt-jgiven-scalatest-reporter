import sbt._

object Dependencies {

  private val jGivenVersion = "0.17.1"
  private val scalatestVersion = "3.2.3"

  lazy val gson = "com.google.code.gson" % "gson" % "2.8.5"
  lazy val `jgiven-core` = "com.tngtech.jgiven" % "jgiven-core" % jGivenVersion
  lazy val `jgiven-html5-report` = "com.tngtech.jgiven" % "jgiven-html5-report" % jGivenVersion
  lazy val scalatest = "org.scalatest" %% "scalatest" % scalatestVersion
  lazy val scalatestflatspec ="org.scalatest" %% "scalatest-flatspec" % scalatestVersion
  lazy val scalatestwordspec ="org.scalatest" %% "scalatest-wordspec" % scalatestVersion
  lazy val scalatestfeaturespec = "org.scalatest" %% "scalatest-featurespec" % scalatestVersion
  lazy val `slf4j-api` = "org.slf4j" % "slf4j-api" % "1.7.26"

}

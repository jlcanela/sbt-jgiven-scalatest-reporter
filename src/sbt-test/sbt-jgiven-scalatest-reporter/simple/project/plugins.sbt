{
  val pluginVersion = System.getProperty("plugin.version")
  if (pluginVersion == null)
    throw new RuntimeException("""|The system property 'plugin.version' is not defined.
                                  |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
  else addSbtPlugin("fr.fpe" % """sbt-jgiven-scalatest-reporter""" % pluginVersion)
}
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.2")

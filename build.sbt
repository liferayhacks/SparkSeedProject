import Dependencies._

name := "DataIngestion"
organization := "com.crisp.analytics" // change to your org
version := "0.1-SNAPSHOT"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  // spark core
  "org.apache.spark" % "spark-core_2.11" % "2.1.1" % "provided",
  "org.apache.spark" % "spark-sql_2.11" % "2.1.1",
  //"org.apache.spark" %% "spark-hive" % "1.6.0" % "provided",
  "com.typesafe" % "config" % "1.2.1",
  
  // spark-modules
  // "org.apache.spark" %% "spark-graphx" % "1.6.0",
  // "org.apache.spark" %% "spark-mllib" % "1.6.0",
  // "org.apache.spark" %% "spark-streaming" % "1.6.0",

  // spark packages
  "com.databricks" %% "spark-avro" % "3.2.0"

  // testing
  //"org.scalatest"   %% "scalatest"    % "2.2.4"   % "test,it",
  //"org.scalacheck"  %% "scalacheck"   % "1.12.2"      % "test,it",

  // logging
  //"org.apache.logging.log4j" % "log4j-api" % "2.4.1",
  //"org.apache.logging.log4j" % "log4j-core" % "2.4.1"
)


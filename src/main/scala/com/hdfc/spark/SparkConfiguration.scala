package com.hdfc.spark

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object SparkConfiguration {
  
  //Getting Spark Configuration With Application Name
  def getSparkConf(appName:String):SparkConf={
    val sparkConf:SparkConf = new SparkConf().setAppName(appName).setMaster("local[1]").set("spark.executor.memory", "1g");
    return sparkConf;
  }
  
  //Getting Spark Context 
  def getSparkContext(sparkConf:SparkConf):SparkContext = {
    val sc = new SparkContext(sparkConf);
    return sc;
  }
  
  //Getting Spark Session With Application Name
  def getSparkSession(appName:String):SparkSession={
    val sparkSession = SparkSession.builder.
      master("local")
      .appName(appName)
      .getOrCreate();
    return sparkSession;
  }
}
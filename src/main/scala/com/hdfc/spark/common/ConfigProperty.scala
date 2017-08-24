package com.hdfc.spark.common

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory


object ConfigProperty {
  
  
  val conf = ConfigFactory.load();
/*  val  bar1 = conf.getInt("foo.bar");
  val  foo = conf.getConfig("foo");
  val  bar2 = foo.getInt("bar");*/
  
}
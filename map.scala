// Databricks notebook source
//super simple map

// COMMAND ----------

val a = List(1,2,3,4,5)

// COMMAND ----------

a.map(x => List(x,0))

// COMMAND ----------

a.flatMap(x => List(x,0))

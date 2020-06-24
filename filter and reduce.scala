// Databricks notebook source
val x = List.range(1,10)

// COMMAND ----------

val evens = x.filter(_ % 2 == 0)

// COMMAND ----------

val seq_elements: Seq[Double] = Seq(3.5, 5.0,1.5)

// COMMAND ----------

val sum: Double = seq_elements.reduce((a,b) => a + b)

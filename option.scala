// Databricks notebook source
//there to add a saftey handler around nulls
val a:Option[String] = Some("value")
val b:Option[String] = None

// COMMAND ----------

a.isEmpty
b.isEmpty

// COMMAND ----------

def showmatch(x: Option[String]) = x match {
  case Some(s) => s
  case None => "?"
}

// COMMAND ----------

showmatch(a)

// COMMAND ----------

b.getOrElse("?")

// COMMAND ----------



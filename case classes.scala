// Databricks notebook source
case class Employee(firstname: String, lastname: String)

// COMMAND ----------

val emp = Employee("Ada", "Lovelace")

// COMMAND ----------

emp.hashCode()

// COMMAND ----------

val emp2 = emp.copy()

// COMMAND ----------

emp2.firstname = "dave"

// COMMAND ----------

val emp3 = emp.copy(firstname="dave")

// COMMAND ----------

// MAGIC %python 
// MAGIC 
// MAGIC emp = True
// MAGIC emp
// MAGIC 
// MAGIC emp = "Name"
// MAGIC emp

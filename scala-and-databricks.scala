// Databricks notebook source
case class Employee(id: String, firstName: String, lastName:String, age:String)    
      
val newEmployeeDs = spark.read.json("/mnt/employeedata/Raw/2019/10/01").as[Employee];
def existingEmployeesDs = List(Employee("123456", "Anna", "Wykes", "38"), 
                               Employee("1234567", "Bob", "Smith", "50"))

// DOES RECORD ALREADY EXIST
val exists = existingEmployeesDs.filter { _.id == newEmployeeDs.first().id }

// NEW RECORD
 if (exists.length == 0)
 {
   //write to datalake as new record
   newEmployeeDs.write.mode("overwrite").format("Employee.json").json("/mnt/employeedata/Refined/")   
 }
else
{
  //DOES IT MATCH EXISTING RECORD
   val matches = exists.map(x => x.hashCode() == newEmployeeDs.head.hashCode()).fold(true)(_ && _)
   if(!matches)
    {
      // UPDATE RECORD
       //here you can perform custom logic on existing data vs new data
       //update record in datalake
        newEmployeeDs.write.mode("overwrite").format(s"Employee.json").json("/mnt/employeedata/Refined")
     }
}



display(newEmployeeDs)

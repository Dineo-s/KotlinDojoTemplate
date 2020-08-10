/*
 TODO:
  -Explain concept of classes and object, primary/secondary constructors and init blocks, default values
  -Convert to data class
  -extend abstract class StudentCentre
 */

data class Student( var studentNo: Int, var name: String, var surname: String , var course: String):StudentCentre()


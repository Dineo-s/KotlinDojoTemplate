/*
 TODO:
  -Make class abstact
  -Concept of varargs
 */

 abstract class StudentCentre {



    fun printStudentInformation(student: Student, vararg listOfModules: String) {

        println("University of Entelect ")
        println("**************************")
        println("Student Details :")
      //  println("Student Number: ${student.studentNo} \n Name: ${student.name}  \n Surname: ${student.surname}")
        println("Course Information :")
        //println("Name of course: ${student.course}")
        if (listOfModules.isEmpty()) {
          //  println("Sorry,list of ${student.course} modules for  is unavailable. Try again later.")
        } else {
            //it can be changed to descriptive wording
            listOfModules.forEach {
                println(it)
            }

        }

    }

}
/*
Class returns a list of courses per course name
Todo:Demo the significance of placing a var/val in constructor
 */

class Module(var courseName: String) {

    fun courseModules(): Array<String> {
        return when (courseName) {
            "Computer Science", "Data Science" -> arrayOf("A", "B", "C")
            "Mathematics" -> arrayOf("A", "C")
            "Economics" -> arrayOf("P", "B", "C")
            else -> arrayOf()
        }
    }

    fun printTimeTable(courseName: String) {
        //Returns a general timetable
    }

    fun printLectureDetails() {
        //Returns details of the lecture for the module
    }


}
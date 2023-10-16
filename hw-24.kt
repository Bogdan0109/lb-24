data class Student(val name: String, val dateOfBirth: String, val className: String, val parentName: String, val contactNumber: String)

class School {
    private val students = mutableListOf<Student>()

    fun addStudent(student: Student) {
        students.add(student)
    }

    fun displayStudents() {
        println("Список учнів у школі:")
        for ((index, student) in students.withIndex()) {
            println("${index + 1}. ПІБ: ${student.name}, Дата народження: ${student.dateOfBirth}, Клас: ${student.className}, Батько: ${student.parentName}, Телефон: ${student.contactNumber}")
        }
    }
}

fun main() {
    val school = School()

    // Додавання учнів
    val student1 = Student("Іванов Іван Іванович", "01.01.2005", "9-A", "Іванова Людмила Петрівна", "+380123456789")
    val student2 = Student("Петров Петро Петрович", "05.03.2006", "8-B", "Петрова Олена Олександрівна", "+380987654321")

    school.addStudent(student1)
    school.addStudent(student2)

    // Виведення списку учнів
    school.displayStudents()
}
